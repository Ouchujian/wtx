package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.SysUserEntity;
import com.entity.VoteEntity;
import com.service.VoteService;
import com.utils.R;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("活动投票")
@RequestMapping("/vote")
public class VoteController extends AbstractController {

	@Autowired
	VoteService voteService;

	@ApiOperation(value = "根据投票id查询详情", notes = "根据投票id查询详情")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", dataType = "String", paramType = "query") })
	@RequestMapping(value = "/queryObject", method = RequestMethod.GET)
	public R queryObject(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		if (StringUtils.isBlank(id)) {
			return R.error("投票Id不能为空");
		}
		VoteEntity vote = voteService.queryObject(Long.valueOf(id));
		return R.ok().put("data", vote);
	}

	@ApiOperation(value = "新增/修改投票", notes = "新增/修改投票")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "userId", value = "userId", dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "title", value = "title", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "content", value = "content", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "status", value = "status", dataType = "String", paramType = "query"),
			@ApiImplicitParam(name = "password", value = "password", dataType = "String", paramType = "query") })
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public R saveOrUpdate(@RequestBody VoteEntity entity, HttpServletRequest request, HttpServletResponse response) {
		SysUserEntity user = getUserInfo(request, response);

		if (user == null || !user.getId().equals(entity.getUserId())) {
			return R.error("userId不正确");
		}
		
		if (entity.getId() == null) {
			voteService.save(entity);
		} else {
			voteService.update(entity);
		}
		return R.ok();
	}
}
