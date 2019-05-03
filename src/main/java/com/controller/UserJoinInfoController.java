package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserJoinInfoEntity;
import com.google.common.collect.Maps;
import com.service.UserJoinInfoService;
import com.utils.PageUtil;
import com.utils.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("用户动态")
@RequestMapping("/userJoinInfo")
public class UserJoinInfoController extends AbstractController {

	@Autowired
	UserJoinInfoService userJoinInfoService;

	@ApiOperation(value = "根据userId查询用户动态", notes = "根据userId查询用户动态")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "userId", value = "userId", dataType = "String",required = true, paramType = "query"),
			@ApiImplicitParam(name = "topic", value = "类型Id", dataType = "Integer",required = true, paramType = "query"),
			@ApiImplicitParam(name = "type", value = "类型(10:活动,20:投票,30:通讯录,40:自定义)", dataType = "Integer",required = true, paramType = "query"),
			@ApiImplicitParam(name = "limit", value = "行数", dataType = "Integer",required = true, paramType = "query"),
			@ApiImplicitParam(name = "page", value = "页码", dataType = "Integer",required = true, paramType = "query") })
	@RequestMapping(value = "/queryList", method = RequestMethod.GET)
	public R queryList(HttpServletRequest request, HttpServletResponse response) {
		String userId = request.getParameter("userId");
		String topic = request.getParameter("topic");
		String type = request.getParameter("type");
		Map<String, Object> map = getParams(request);
		Map<String, Object> params = Maps.newHashMap();
		params.put("userId", userId);
		params.put("topic", topic);
		params.put("type", type);
		List<UserJoinInfoEntity> dataList = userJoinInfoService.queryList(params);
		int total = userJoinInfoService.queryTotal(params);
		return R.ok().put("page", new PageUtil(dataList, total, map));
	}

	@ApiOperation(value = "保存/修改用户动态", notes = "保存/修改用户动态")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "userId", value = "userId", dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "type", value = "type", dataType = "Integer", paramType = "query"),
			@ApiImplicitParam(name = "topic", value = "topic", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "topicName", value = "topicName", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "userName", value = "userName", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "mobile", value = "mobile", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "remark", value = "remark", dataType = "String", paramType = "query") })
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public R saveOrUpdate(@RequestBody UserJoinInfoEntity entity, HttpServletRequest request,
			HttpServletResponse response) {
		if (entity == null || entity.getType() == null || StringUtils.isBlank(entity.getTopic())) {
			return R.error("请求参数type、topic不能为空");
		}
		if (entity.getId() == null) {
			userJoinInfoService.save(entity);
		} else {
			userJoinInfoService.update(entity);
		}
		return R.ok();
	}

	@ApiOperation(value = "删除用户动态", notes = "删除用户动态")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", dataType = "Long", paramType = "query") })
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public R delete(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		if (StringUtils.isBlank(id)) {
			return R.error("id不能为空");
		}
		userJoinInfoService.delete(Long.valueOf(id));
		return R.ok();
	}
}
