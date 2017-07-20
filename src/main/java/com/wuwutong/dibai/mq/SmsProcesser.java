package com.wuwutong.dibai.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.wuwutong.dibai.util.Constants;

@Component
public class SmsProcesser {
	
	@JmsListener(destination=Constants.SMS_ARRIVED_QUERY_QUEUE_NAME)
    public void querySmsArrived(String message){
		
		
    }
}