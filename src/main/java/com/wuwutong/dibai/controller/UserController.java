package com.wuwutong.dibai.controller;

import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuwutong.dibai.enums.AuthStatus;
import com.wuwutong.dibai.po.User;
import com.wuwutong.dibai.service.SmsBiz;
import com.wuwutong.dibai.service.UserBiz;
import com.wuwutong.dibai.util.VerifyUtil;
import com.wuwutong.dibai.vo.LoginForm;
import com.wuwutong.dibai.vo.ResponseResult;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static final String IDENTIFY_CODE_ATTR="_identify_code_";
	private static final String USER_INFO_ATTR="_user_info_";
	private static final String USER_MOBILE_ATTR="_user_mobile_";
	private Random random=new Random();
	@Autowired
	private HttpSessionProvider httpSession;
	@Autowired
	private UserBiz userBiz;
	@Autowired
	private SmsBiz smsBiz;
	
	@RequestMapping("/fetchIdentifyCode")
	public ResponseResult sendIdentifyCode(String mobile) throws IOException{
		String code = String.format("%04d", random.nextInt(9999));
		httpSession.setAttibute(IDENTIFY_CODE_ATTR, code);
		httpSession.setAttibute(USER_MOBILE_ATTR, mobile);
		return smsBiz.sendIdentifyCode(mobile,code);
	}
	
	@RequestMapping("/register")
	public ResponseResult register(LoginForm loginForm){
		if(StringUtils.isBlank(loginForm.getMobile())){
			return ResponseResult.createFail("手机号不能为空");
		}
		if(!StringUtils.equals(loginForm.getMobile(),httpSession.getAttibute(USER_MOBILE_ATTR, String.class))){
			return ResponseResult.createFail("手机号不一致");
		}
		//TODO 发送短信的手机号一致？
		if(!VerifyUtil.isMobile(loginForm.getMobile())){
			return ResponseResult.createFail("格式错误");
		}
		if(StringUtils.isBlank(loginForm.getIdentifyCode())){
			return ResponseResult.createFail("验证码不能为空");
		}
		if(!StringUtils.equals(loginForm.getIdentifyCode(), httpSession.getAttibute(IDENTIFY_CODE_ATTR, String.class))){
			return ResponseResult.createFail("验证码错误");
		}
//		if(){
//			
//		}
//		
//		User user=userBiz.findUser();
		
		ResponseResult ret=userBiz.register(loginForm.getMobile(),loginForm.getIdentifyCode(),loginForm.getInvitationCode());
		httpSession.setAttibute(USER_INFO_ATTR, ret.getData());
		return ret;
	}
	
	
	@RequestMapping("/payDeposit")
	public ResponseResult payDeposit(){
		User user=httpSession.getAttibute(USER_INFO_ATTR, User.class);
		if(user==null){
			return ResponseResult.createFail("请先完成手机验证");
		}
		if(user.getAuthStatus()!=AuthStatus.MOBILE_AUTH && user.getAuthStatus()!=AuthStatus.PAY_DEPOSIT){
			return ResponseResult.createFail("已缴纳押金，无需重复缴纳");
		}
		ResponseResult ret=userBiz.payDeposit(user);
		return ret;
	}
	
	@RequestMapping("/auth")
	public ResponseResult auth(){
		
		return null;
	}
	
	
	

}
