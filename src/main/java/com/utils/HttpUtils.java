package com.utils;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

/**
 * Http请求工具类
 *
 * @author snowfigure
 * @version v1.0.1
 * @since 2014-8-24 13:30:56
 */
public class HttpUtils {

	private String url;

	private boolean isJson = false;
	private String method = "GET";
	private Map<String, Object> params = Maps.newHashMap();
	private Map<String, Object> headers = Maps.newHashMap();

	private JSONObject body = new JSONObject();

	private HttpUtils() {
	};

	public static HttpUtils build() {
		return new HttpUtils();
	}

	/**
	 * 添加body的参数，用于POST请求
	 * 
	 * @param key
	 * @param value
	 */
	public void addBody(String key, String value) {
		body.put(key, value);
	}

	/**
	 * 直接设置body，将覆盖原body的数据
	 * 
	 * @param body
	 */
	public void setBody(JSONObject body) {
		this.body = body;
	}

	/**
	 * 设置请求地址
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 设置请求方式 GET/POST
	 * 
	 * @param method
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * is json
	 * 
	 * @param isJson
	 */
	public void setIsJson(boolean isJson) {
		this.isJson = isJson;
	}

	/**
	 * add param
	 * 
	 * @param key
	 * @param value
	 */
	public HttpUtils addParam(String key, Object value) {
		params.put(key, value);
		return this;
	}

	/**
	 * add header
	 * 
	 * @param key
	 * @param value
	 */
	public HttpUtils addHeader(String key, Object value) {
		headers.put(key, value);
		return this;
	}

	private String toStringParam() {
		if (params.size() == 0) {
			return null;
		}
		StringBuffer str = new StringBuffer();

		for (Map.Entry<String, Object> entity : params.entrySet()) {
			str.append(entity.getKey() + "=" + entity.getValue() + "&");
		}
		return str.substring(0, str.lastIndexOf("&"));
	}

	public JSONObject send() {
		
		String result = null;
		switch (method) {
		case "GET":
			result = sendGet();break;
		case "POST":
			result =  sendPost();break;
		}
		if(result != null) {
			return JSON.parseObject("result");
		}
		return null;
	}

	/**
	 * 向指定URL发送GET方法的请求
	 *
	 * @param url   发送请求的URL
	 * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return URL 所代表远程资源的响应结果
	 */
	private String sendGet() {
		String result = "";
		String url = this.url + "?" + toStringParam();
		// 1. 创建HttpClient对象
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		// 2. 创建HttpGet对象
		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("Authorization", "Basic YWRtaW46");

		CloseableHttpResponse response = null;
		try {
			// 3. 执行GET请求
			response = httpClient.execute(httpGet);
			System.out.println(response.getStatusLine());
			// 4. 获取响应实体
			HttpEntity entity = response.getEntity();
			// 5. 处理响应实体
			result = EntityUtils.toString(entity);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 6. 释放资源
			try {
				response.close();
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 向指定 URL 发送POST方法的请求
	 *
	 * @param url     发送请求的 URL
	 * @param param   请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @param isproxy 是否使用代理模式
	 * @return 所代表远程资源的响应结果
	 */
	private String sendPost() {
		String result = null;
		String url = this.url + "?" + toStringParam();
		// 1. 创建HttpClient对象
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		// 2. 创建HttpPost对象
		HttpPost post = new HttpPost(url);

		post.addHeader("Authorization", "Basic YWRtaW46");

		if (isJson) {
			post.addHeader("Content-Type", "application/json");
		}

		// 3. 设置POST请求传递参数
		StringEntity requestEntity = new StringEntity(body.toString(), "utf-8");
		post.setEntity(requestEntity);
		// 4. 执行请求并处理响应
		try {
			CloseableHttpResponse response = httpClient.execute(post);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				result = EntityUtils.toString(entity);
			}
			response.close();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		HttpUtils http = HttpUtils.build();
		http.setMethod("POST");
		http.setIsJson(true);
		http.setUrl("http://127.0.0.1:9000//wechat/msgTemplate/sendMessage?key=23423423&df=1231231");
		http.addBody("msgContent", "6666");
		http.send();

	}

}