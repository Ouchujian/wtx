package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.ActivityDao;
import com.entity.ActivityEntity;
import com.utils.R;

@Controller
@RequestMapping("/activity")
public class ActivityController {
	
	@Autowired
	private ActivityDao activityDao;
	
	@ResponseBody
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public R login(HttpServletRequest req,HttpServletResponse res){
		ActivityEntity record = new ActivityEntity();
		record.setContent("666"); 
		return R.ok();
		
	}
	
}
