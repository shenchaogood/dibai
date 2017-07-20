package com.wuwutong.dibai.controller;

import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.enums.AuthStatus;
import com.wuwutong.dibai.po.User;
import com.wuwutong.dibai.service.SmsBiz;
import com.wuwutong.dibai.service.UserBiz;
import com.wuwutong.dibai.util.Constants;
import com.wuwutong.dibai.util.VerifyUtil;
import com.wuwutong.dibai.vo.LoginForm;

@RestController
@RequestMapping("/user")
public class UserController {
	
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
		return smsBiz.sendIdentifyCode(mobile,code);
	}
	
	@RequestMapping("/register")
	public ResponseResult register(LoginForm loginForm){
		if(StringUtils.isBlank(loginForm.getMobile())){
			return ResponseResult.createFail("手机号不能为空");
		}
		if(!VerifyUtil.isMobile(loginForm.getMobile())){
			return ResponseResult.createFail("格式错误");
		}
		if(StringUtils.isBlank(loginForm.getIdentifyCode())){
			return ResponseResult.createFail("验证码不能为空");
		}
		if(StringUtils.isBlank(loginForm.getIdentifyCodeId())){
			return ResponseResult.createFail("请先获取验证码");
		}
		if(!VerifyUtil.isNumber(loginForm.getIdentifyCodeId())){
			return ResponseResult.createFail("客户端错误:identifyCodeId格式错误");
		}
		ResponseResult ret=userBiz.register(loginForm.getMobile(),loginForm.getIdentifyCode(),loginForm.getInvitationCode(),loginForm.getIdentifyCodeId());
		httpSession.setAttibute(Constants.CURRENT_LOGIN_USER, ret.getData());
		return ret;
	}
	
	
	@RequestMapping("/payDeposit")
	public ResponseResult payDeposit(){
		User user=httpSession.getAttibute(Constants.CURRENT_LOGIN_USER, User.class);
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
