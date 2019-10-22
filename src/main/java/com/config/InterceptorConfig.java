package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.interceptor.BussinessInterceptor;

public class InterceptorConfig implements WebMvcConfigurer {
	
	@Autowired
	BussinessInterceptor bussinessInterceptor;

	// 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(bussinessInterceptor).addPathPatterns("/**");
	}
}
