package com.wuwutong.dibai.service;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.mapper.UserMapper;
import com.wuwutong.dibai.po.SmsIdentify;
import com.wuwutong.dibai.po.User;
import com.wuwutong.dibai.po.UserExample;
import com.wuwutong.dibai.util.IDGenerator;

@Service
public class UserBiz extends BaseBiz<User, UserMapper>{
	@Autowired
	public UserBiz(UserMapper mapper) throws ClassNotFoundException {
		super(mapper);
	}
	
	@Autowired
	private SmsBiz smsBiz;

	public ResponseResult<User> register(String mobile,String identifyCode,String invitationCode,String identifyCodeId){
		ResponseResult<SmsIdentify> smsIdentify=smsBiz.findById(Long.parseLong(identifyCodeId));
		if(Objects.isNull(smsIdentify.getData())){
			return ResponseResult.<User>createFail("请先获取验证码");
		}
		if(!StringUtils.equals(mobile, smsIdentify.getData().getTo())){
			return ResponseResult.<User>createFail("注册手机号与发验证码手机不一致");
		}
		if(!StringUtils.equals(identifyCode, smsIdentify.getData().getIdentifyCode())){
			return ResponseResult.<User>createFail("验证码错误");
		}
		
		UserExample example=new UserExample();
		example.createCriteria().andMobileEqualTo(mobile);
		if(mapper.selectByExample(example)!=null){
			return ResponseResult.createFail("此手机号已被注册");
		}
		User user=new User();
		user.setId(IDGenerator.generate());
		user.setMobile(mobile);
		user.setIdentifyCode(identifyCode);
		user.setInvitationCode(invitationCode);
		return add(user).setData(user);
	}

	public ResponseResult<User> payDeposit(User user) {
		return null;
	}
	
}
