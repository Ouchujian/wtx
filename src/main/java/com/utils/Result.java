package com.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Result extends ResponseEntity<Object> {
	//默认返回信息
	public final static String MSG_SUCCESS = "请求成功";
	public final static String MSG_ERROR = "请求失败";    
	public final static String MSG_SERVICE_ERROR = "服务器异常";
 
	public Result(Object body, HttpStatus status) {
		super(body, status);
		// TODO Auto-generated constructor stub
	}
	
	public static Result success(){
		return responsedata(null,MSG_SUCCESS,HttpStatus.OK);
	}
	
	public static Result success(Object data){
		return responsedata(data,MSG_SUCCESS,HttpStatus.OK);
	}
	
	public static Result success(Object data,String msg){
		return responsedata(data,msg,HttpStatus.OK);
	}
	
	public static Result error(){
		return responsedata(null,MSG_ERROR,HttpStatus.BAD_REQUEST);
	}
	
	public static Result error(Object data){
		return responsedata(data,MSG_ERROR,HttpStatus.BAD_REQUEST);
	}
	
	public static Result error(String msg,HttpStatus code){
		return responsedata(null,msg,code);
	}

	public static Result error(Object data,String msg,HttpStatus code){
		return responsedata(data,msg,code);
	}
	
	public static Result error(Object data,String msg){
		return responsedata(data,msg,HttpStatus.BAD_REQUEST);
	}
	
	public static Result responsedata(Object data,String msg,HttpStatus code){
		Map<String,Object> map = new HashMap<>();
		map.put("data", data);
		map.put("msg", msg);
		return new Result(map,code);
	}
}
