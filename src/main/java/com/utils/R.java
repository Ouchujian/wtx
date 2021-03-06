package com.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;

	public R() {
		this.put("code", 0);
		this.put("msg", "success");
	}

	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}

	public static R error(Object msg) {
		return error(500, msg);
	}

	public static R error(int code, Object msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(Object msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}

	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}

	public static R ok() {
		return new R();
	}

	public R put(String key, Object value) {
		super.put(key, JSON.toJSON(value));
		return this;
	}
}
