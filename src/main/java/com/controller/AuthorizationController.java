package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.config.AppConfig;
import com.utils.HttpUtils;
import com.utils.Result;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/wechat/authorization")
@PropertySource({ "classpath:data.properties" })
public class AuthorizationController extends AbstractController {

	@ApiOperation(value = "小程序身份校验", notes = "小程序身份校验")
	@ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "id", dataType = "Long", paramType = "query"),
			@ApiImplicitParam(name = "code", value = "code", dataType = "String", paramType = "query") })
	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	public Result getToken(HttpServletRequest request, HttpServletResponse response) {
		String code = request.getParameter("code");
		if (StringUtils.isBlank("code")) {
			Result.error(null, code);
		}
		HttpUtils client = HttpUtils.build();
		client.setMethod("GET");
		client.setUrl(AppConfig.web_token_url);
		client.addParam("appid", AppConfig.APPID).addParam("secret", AppConfig.AppSecret).addParam("js_code", code)
				.addParam("grant_type", "authorization_code");
		JSONObject obj = client.send();
		if(obj.getInteger("errcode") != 0) {
			Result.error(obj);
		}
		return Result.success();
	}
}
