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
import com.service.ActivityService;
import com.utils.R;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/activity")
public class ActivityController  extends AbstractController{
	
	@Autowired
	private ActivityService activityService;
	
    @ApiOperation(value = "根据wxId/userId查询用户动态", notes = "根据wxId/userId查询用户动态")
    @ApiImplicitParams({@ApiImplicitParam(name = "wxId", value = "wxId", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "userId", value = "userId", dataType = "String", paramType = "query")})
	@RequestMapping(value = "/queryList", method = RequestMethod.GET)
	public R queryObject(HttpServletRequest request,HttpServletResponse response){
		ActivityEntity record = new ActivityEntity();
		record.setContent("666"); 
		return R.ok();
		
	}
	
}
