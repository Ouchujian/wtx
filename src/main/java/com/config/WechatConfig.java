package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 微信相关配置
 * 
 * @author ouchujian
 */
@Component
@PropertySource({ "classpath:data.properties" })
public class WechatConfig {
	public static String APPID;
	 
	@Value("${wx.appid}")
	public void setAppid(String appid) {
		WechatConfig.APPID = appid;
	}
 
	public static String SECRECT;
	
	@Value("${wx.secret}")
	public void setSecret(String secret) {
		WechatConfig.SECRECT = secret;
	}
	
	
	public static String webAccessTokenURL;
	
	@Value("${wx.url.web.token}")
	public void setWebAccessTokenURL(String webAccessTokenURL) {
		WechatConfig.webAccessTokenURL = webAccessTokenURL;
	}
	
	public static String refreshWebAccessTokenURL;
	
	@Value("${wx.url.web.token.refresh}")
	public void setRefreshWebAccessTokenURL(String refreshWebAccessTokenURL) {
		WechatConfig.refreshWebAccessTokenURL = refreshWebAccessTokenURL;
	}

	public static String apiAccessTokenURL;

	@Value("${wx.url.api.token}")
	public void setApiAccessTokenURL(String apiAccessTokenURL) {
		WechatConfig.apiAccessTokenURL = apiAccessTokenURL;
	}
	 
	
	public static String WEB_GRANT_TYPE = "authorization_code" ;
	public static String API_GRANT_TYPE = "client_credential" ;
 
}
