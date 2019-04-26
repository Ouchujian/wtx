package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.SysUserEntity;
import com.service.SysUserService;
import com.utils.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("用户信息")
@RequestMapping("/user")
public class SysUserController extends AbstractController{
	@Autowired
	SysUserService sysUserService;
	
    @ApiOperation(value = "根据wxId/userId查询用户", notes = "根据wxId/userId查询用户")
    @ApiImplicitParams({@ApiImplicitParam(name = "wxId", value = "wxId", dataType = "String", paramType = "query"),
    		@ApiImplicitParam(name = "userId", value = "userId", dataType = "String", paramType = "query")})
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public R getUser(HttpServletRequest request,HttpServletResponse response){
		SysUserEntity user = getUserInfo(request, response);
		return R.ok().put("data", user);
	}
}
