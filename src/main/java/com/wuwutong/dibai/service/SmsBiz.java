package com.wuwutong.dibai.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.enums.SmsIdentifyCodeStatus;
import com.wuwutong.dibai.mapper.SmsIdentifyMapper;
import com.wuwutong.dibai.po.SmsIdentify;
import com.wuwutong.dibai.po.SmsTemplate;
import com.wuwutong.dibai.util.Coder;
import com.wuwutong.dibai.util.DateTimeUtil;
import com.wuwutong.dibai.util.HttpClientUtil;
import com.wuwutong.dibai.util.HttpClientUtil.HttpResult;
import com.wuwutong.dibai.util.IDGenerator;


@Service
public class SmsBiz extends BaseBiz<SmsIdentify, SmsIdentifyMapper>{
	
	//验证码短信模板
	@Value("${sms.identify_code_template_id}")
	private String identifyCodeTemplateId;
	//短信接口base url
	@Value("${sms.base_url}")
	private String baseUrl;
	//AppID
	@Value("${sms.app_id}")
	private String appId;
	//ACCOUNT SID
	@Value("${sms.account_sid}")
	private String accountSid;
	//AUTH TOKEN
	@Value("${sms.auth_token}")
	private String authToken;
	//APP TOKEN
	@Value("${sms.app_token}")
	private String appToken;
	@Value("${sms.soft_version}")
	private String softVersion;
	
	
	@Autowired
	public SmsBiz(SmsIdentifyMapper mapper) throws ClassNotFoundException {
		super(mapper);
	}
	
	/**
	 * 获取接口地址
	 * @return
	 */
	private String getCommonUrl(long timestamp,String fun){
		//账户Id + 账户授权令牌 + 时间戳
		String sig=StringUtils.upperCase(Coder.encryptHexMD5(accountSid+authToken+DateTimeUtil.format(timestamp,"yyyyMMddHHmmss")));
		return baseUrl+"/"+softVersion+"/Accounts/"+accountSid+"/SMS/"+fun+"?sig="+sig;
	}

	/**
	 * 短信接口必带的头
	 * @return
	 */
	private Map<String,String> generateHttpHeaders(long timestamp){
		Map<String,String> headers=Maps.newHashMap();
		headers.put("Accept", "application/json");
		headers.put("Content-Type", "application/json;charset=utf-8");
		//使用Base64编码（账户Id + 冒号 + 时间戳）
		byte[] authorization=(accountSid+":"+DateTimeUtil.format(timestamp,"yyyyMMddHHmmss")).getBytes();
		headers.put("Authorization",Coder.encryptBASE64(authorization));
		return headers;
	}
	
	/**
	 * 
	 * @param mobile
	 * @param code
	 * @return
	 */
	public ResponseResult sendIdentifyCode(String mobile, String code) {
		long currentTime=System.currentTimeMillis();
		String url=getCommonUrl(currentTime,"TemplateSMS");
		SmsIdentify sms=new SmsIdentify();
		sms.setId(IDGenerator.generate());
		sms.setTo(mobile);
		sms.setAppId(appId);
		sms.setIdentifyCode(code);
		sms.setTemplateId(identifyCodeTemplateId);
		sms.setCreateTime(new Date());
		JSONArray datas=new JSONArray(Arrays.asList(code,"1"));
		sms.setDatas(datas.toString());
		sms.setSmsMessageSid("_"+sms.getId()+"_");
		
		JSONObject json=new JSONObject();
		json.put("to", sms.getTo());
		json.put("appId", sms.getAppId());
		json.put("templateId", sms.getTemplateId());
		json.put("datas", datas);
		
		Map<String,String> headers=generateHttpHeaders(currentTime);
		ResponseResult ret=null;
		try {
			HttpResult result = HttpClientUtil.post(url, json.toJSONString(), headers, null);
			JSONObject response=JSONObject.parseObject(result.content);
			String statusCode=response.getString("statusCode");
			sms.setStatusCode(statusCode);
			if(result.statusCode==200&&statusCode.equals("000000")){
				// 调用成功非到达
				JSONObject templateSMS=response.getJSONObject("templateSMS");
				if(templateSMS!=null){
					String smsMessageSid=StringUtils.defaultString(templateSMS.getString("smsMessageSid"),"");
					String dateCreated=StringUtils.defaultString(templateSMS.getString("dateCreated"),"");//yyyyMMddHHmmss
					sms.setSmsMessageSid(smsMessageSid);
					if(Pattern.matches("^\\d{14}$", dateCreated)){
						sms.setDateCreated(DateTimeUtil.parseDate(dateCreated, "yyyyMMddHHmmss"));
						sms.setStatus(SmsIdentifyCodeStatus.SEND_SUCCESS);
						ret=ResponseResult.createSuccess().setData(sms.getId());
					}else{
						LOGGER.info("验证码短信响应时间:{}",dateCreated);
						sms.setStatus(SmsIdentifyCodeStatus.RESPONSE_DATE_ERROR);
						LOGGER.warn("验证码短信响应时间dateCreated格式错误:{}",response);
						ret=ResponseResult.createFail("内部错误");
					}
				}else{
					sms.setStatus(SmsIdentifyCodeStatus.RESPONSE_CONTENT_ERROR);
					LOGGER.error("短信接口错误:{}",response);
					ret=ResponseResult.createFail("短信接口错误");
				}
			}else{
				sms.setStatus(SmsIdentifyCodeStatus.RESPONSE_CODE_ERROR);
				LOGGER.error("短信接口状态码非000000:{}",response);
				ret=ResponseResult.createFail();
			}
		} catch (IOException e) {
			ret=ResponseResult.createFail(e.getLocalizedMessage());
		}
		add(sms);
		return ret;
	}
	
	public ResponseResult createTemplate(){
		long currentTime=System.currentTimeMillis();
		String url=getCommonUrl(currentTime,"CreateSMSTemplate");
		Map<String,String> headers=generateHttpHeaders(currentTime);
		SmsTemplate template=new SmsTemplate();
		template.setId(IDGenerator.generate());
		template.setCreateTime(new Date());
		template.setProductType("");
//		template.setSignature(signature);
//		template.setTemplateContent(templateContent);
//		
//		JSONObject json=new JSONObject();
//		json.put("to", sms.getTo());
//		json.put("appId", sms.getAppId());
//		json.put("templateId", sms.getTemplateId());
//		json.put("datas", sms.getDatas());
		
		//{"appId":"ff8080813fc70a7b013fc72312324213","productType":"1","addr":"http://yuntongxun","title":"云通讯","signature":"云通讯","templateContent":"云通讯"}

		return null;
	}

}
