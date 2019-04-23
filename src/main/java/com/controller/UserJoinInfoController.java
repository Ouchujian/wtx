package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.SysUserEntity;
import com.entity.UserJoinInfoEntity;
import com.google.common.collect.Maps;
import com.service.UserJoinInfoService;
import com.utils.PageUtil;
import com.utils.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("用户动态明细表")
@RequestMapping("/userJoinInfo")
public class UserJoinInfoController extends AbstractController{
	 
	@Autowired
	UserJoinInfoService userJoinInfoService;
	
    @ApiOperation(value = "根据wxId查询用户动态", notes = "根据wxId查询用户动态")
    @ApiImplicitParam(name = "微信Id", value = "wxId", paramType = "path", required = true, dataType = "String")
	@RequestMapping(value = "/queryList", method = RequestMethod.GET)
	public R queryList(HttpServletRequest request,HttpServletResponse response){
		SysUserEntity user = getUserInfo(request, response);
		Map<String,Object> map = getParams(request);
		Map<String,Object> params = Maps.newHashMap();
		params.put("userId", user.getId());
		List<UserJoinInfoEntity> dataList = userJoinInfoService.queryList(params);
		int total = userJoinInfoService.queryTotal(params);
		return R.ok().put("page", new PageUtil(dataList, total, map));
	}
}