package com.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.SysUserEntity;
import com.google.common.collect.Maps;
import com.service.SysUserService;

public abstract class AbstractController {
	
	@Autowired
	SysUserService sysUserService;
	
	/**
	 * 获取用户
	 * @param request
	 * @param response
	 * @return
	 */
	SysUserEntity getUserInfo(HttpServletRequest request,HttpServletResponse response) {
		String wxId = request.getParameter("wxId");
		String userId = request.getParameter("userId");
		SysUserEntity user = null;
		if(StringUtils.isNoneBlank(wxId)) {
			user = sysUserService.selectByWxid(wxId);
		}else if(StringUtils.isNoneBlank(userId)) {
			user = sysUserService.selectByPrimaryKey(Long.valueOf(userId));
		}
		return user;
	}
	
	public Map<String,Object> getParams(HttpServletRequest req){
		Enumeration<String> names = req.getParameterNames();
		Map<String,Object> map = Maps.newHashMap();
		
		while(names.hasMoreElements()){
			String name = names.nextElement();
			String value = req.getParameter(name);
			map.put(name, value);
		}
		
		 String page = req.getParameter("page");
		 String limit = req.getParameter("limit");
		 if(StringUtils.isNotBlank(page) && StringUtils.isNotBlank(limit)){
			 int offset = (Integer.valueOf(page) - 1) * Integer.valueOf(limit);
			 map.put("offset", offset);
			 map.put("page", Integer.valueOf(page));
			 map.put("limit", Integer.valueOf(limit));
		 }
		 
		return map;
	}
}
