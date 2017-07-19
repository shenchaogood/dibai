package com.wuwutong.dibai.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class ServletHttpSessionProvider implements HttpSessionProvider {

	@Override
	public void setAttibute(String name, Object value) {
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
		session.setAttribute(name, value);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAttibute(String name, Class<T> type) {
		HttpSession session = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
		return (T)session.getAttribute(name);
	}

}
