package com.wuwutong.dibai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.mapper.UserMapper;
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

	public ResponseResult register(String mobile,String identifyCode,String invitationCode,String identifyCodeId){
		
		ResponseResult smsIdentify=smsBiz.findById(Long.parseLong(identifyCodeId));
		
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

	public ResponseResult payDeposit(User user) {
		return null;
	}
	
}
