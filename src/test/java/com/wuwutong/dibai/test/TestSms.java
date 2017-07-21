package com.wuwutong.dibai.test;

import java.io.IOException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wuwutong.dibai.common.DataTableParam;
import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.enums.SmsQueryStrategy;
import com.wuwutong.dibai.service.SmsBiz;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-base.xml")
public class TestSms {

	private static final Logger LOGGER=LoggerFactory.getLogger(TestSms.class);
	
	@Autowired
	private SmsBiz smsBiz;
	
	@Test
	public void testSendIdentifyCode(){
		ResponseResult<Long> ret=smsBiz.sendIdentifyCode("18600138712", "1234");
		LOGGER.debug("{}",ret);
	}
	
	@Test
	public void testQuerySmsStatus() throws IOException{
		ResponseResult<SmsQueryStrategy> ret=smsBiz.querySmsStatus(337710838255190016L, new Date(), "df257e34709d4021b8bc8ed2afcee277");
		LOGGER.debug("{}",ret);
	}
	
	@Test
	public void testList(){
		smsBiz.list(new DataTableParam());
	}
	
}
