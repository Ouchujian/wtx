package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ActivityEntity;
import com.entity.SysUserEntity;
import com.entity.VoteActivityEntity;
import com.service.ActivityService;
import com.service.VoteActivityService;
import com.utils.R;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController	
@RequestMapping("/activity")
public class ActivityController  extends AbstractController{
	
	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private VoteActivityService voteActivityService;
	
    @ApiOperation(value = "根据活动id查询活动详情", notes = "根据活动id查询活动详情")
    @ApiImplicitParams({
		@ApiImplicitParam(name = "id", value = "id", dataType = "String", paramType = "query")})
	@RequestMapping(value = "/queryObject", method = RequestMethod.GET)
	public R queryObject(HttpServletRequest request,HttpServletResponse response){
		String id = request.getParameter("id");
		if(StringUtils.isBlank(id)) {
			return R.error("活动Id不能为空");
		}
		ActivityEntity acitity = activityService.queryObject(Long.valueOf(id)) ;
		return R.ok().put("data", acitity);	
	}
    
    @ApiOperation(value = "新增/修改活动", notes = "新增/修改活动")
    @ApiImplicitParams({
    	@ApiImplicitParam(name = "id", value = "id", dataType = "Long", paramType = "query"),
		@ApiImplicitParam(name = "userId", value = "userId", dataType = "Long", paramType = "query"),
		@ApiImplicitParam(name = "title", value = "title", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "content", value = "content", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "site", value = "site", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "targetDate", value = "targetDate", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "status", value = "status", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "endDate", value = "endDate", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "password", value = "password", dataType = "String", paramType = "query"),
		@ApiImplicitParam(name = "voteId", value = "投票Id", dataType = "Long", paramType = "query")})
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public R saveOrUpdate(@RequestBody ActivityEntity entity, HttpServletRequest request,HttpServletResponse response){
		SysUserEntity user = getUserInfo(request, response);
		String voteId = request.getParameter("voteId");
		if(entity.getId() == null) {
			//投票活动
			if(StringUtils.isNoneBlank(voteId)) {
				entity.setStatus(0); //草拟
				Long activityId = activityService.save(entity);
				VoteActivityEntity voteActivity = new VoteActivityEntity();
				voteActivity.setVoteId(Long.valueOf(voteId));
				voteActivity.setActivityId(activityId);
				voteActivityService.save(voteActivity);
			}else {
				 activityService.save(entity);
			}
		}else {
			activityService.update(entity);
		}
		return R.ok();
	}
}
