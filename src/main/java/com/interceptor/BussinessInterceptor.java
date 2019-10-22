package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

public class BussinessInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String bussinessName = request.getHeader("X-Forward-School");
		if(StringUtils.isBlank(bussinessName)){
			bussinessName = "kuaiji";
		}
		
		return true;
	}
}
