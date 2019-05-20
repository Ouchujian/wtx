package com.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.exception.FriendlyException;
import com.utils.Result;

/**
 * 全局异常拦截(拦截所有未被捕捉的异常)
 * @author ouchujian
 */
@ControllerAdvice
public class ExceptionInterceptConfig {
	
	@ExceptionHandler({Exception.class})
	public Result intercept(Exception exception) {
		if(exception instanceof FriendlyException) {
			return Result.error(exception.getMessage(),Result.MSG_ERROR,HttpStatus.BAD_REQUEST);
		}
		exception.printStackTrace();
		return Result.error(exception.getMessage(),Result.MSG_SERVICE_ERROR,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
