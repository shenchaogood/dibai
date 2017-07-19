package com.wuwutong.dibai.controller;

public interface HttpSessionProvider{
	
	void setAttibute(String name,Object value);

	<T> T getAttibute(String name, Class<T> type);
	
}
