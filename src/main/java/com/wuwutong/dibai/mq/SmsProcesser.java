package com.wuwutong.dibai.mq;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ScheduledMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.wuwutong.dibai.common.ResponseResult;
import com.wuwutong.dibai.enums.SmsQueryStrategy;
import com.wuwutong.dibai.po.SmsIdentify;
import com.wuwutong.dibai.service.SmsBiz;
import com.wuwutong.dibai.util.Constants;

@Component
public class SmsProcesser {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private SmsBiz smsBiz;
	
	@JmsListener(destination=Constants.SMS_ARRIVED_QUERY_QUEUE_NAME)
    public void querySmsArrived(Session session,ObjectMessage message) throws JMSException{
		try {
			SmsIdentify task=(SmsIdentify)message.getObject();
			ResponseResult<SmsQueryStrategy> ret = smsBiz.querySmsStatus(task.getId(), 
					task.getDateCreated(),task.getSmsMessageSid());
			if(ret.isSuccess()){
				message.acknowledge();
			}else{
				session.recover();
			}
		} catch (IOException e) {
			session.recover();
		}
    }
	
	public void deliverSmsQueryMessage(SmsIdentify task) {
		jmsTemplate.send((session)->{
			ObjectMessage message=session.createObjectMessage(task);
			message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, 10000);
			return message;
		});
	}
	
	
}