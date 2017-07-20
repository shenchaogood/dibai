package com.wuwutong.dibai.enums;

public enum SmsIdentifyCodeStatus {
	//短信状态0调用发送接口,1返回状态码非000000,2已成功发送，不代表到达,3返回内容与预期不符,4返回dateCreated格式错误,5已送达,6丢失
	CREATED,
	RESPONSE_CODE_ERROR,
	SEND_SUCCESS,
	RESPONSE_CONTENT_ERROR,
	RESPONSE_DATE_ERROR,
	ARRIVED,
	LOST
}
