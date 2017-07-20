package com.wuwutong.dibai.mq;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.enums.SmsQueryStrategy;
import com.wuwutong.dibai.service.SmsBiz;
import com.wuwutong.dibai.util.Constants;

@Component
public class SmsProcesser {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private SmsBiz smsBiz;
	
	@JmsListener(destination=Constants.SMS_ARRIVED_QUERY_QUEUE_NAME)
    public void querySmsArrived(Session session,Message message) throws JMSException{
		try {
			ResponseResult<SmsQueryStrategy> ret = smsBiz.querySmsStatus(message.getLongProperty("id"), message.getStringProperty("sendDate"), message.getStringProperty("smsMessageSid"));
			if(ret.isSuccess()){
				message.acknowledge();
			}else{
				session.recover();
			}
		} catch (IOException e) {
			session.recover();
		}
    }
	
	public void deliverSmsQueryMessage(Long id, String sendDate, String smsMessageSid) {
		jmsTemplate.send((session)->{
			Message msg=session.createMessage();
			msg.setLongProperty("id",id);
			msg.setStringProperty("sendDate", sendDate);
			msg.setStringProperty("smsMessageSid", smsMessageSid);
			return msg;
		});
	}
	
	
}