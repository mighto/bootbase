package com.boot.base.common.domain;

import java.io.Serializable;


/**
 * 功能描述: ResultEnv
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月11日
 *************************************
 */

public class ResEnv<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int status;
	private String message;
	private T data;
	
	public ResEnv(){
		super();
	}
	
	public ResEnv(int status) {
		this();
		this.status = status;
	}
	
	public ResEnv(int status, String message) {
		this(status);
		this.message = message;
	}
	
	public ResEnv(int status, String message, T data) {
		this(status, message);
		this.data = data;
	}
	
	
	public static <T> ResEnv<T> success(String msg, T object){
		return new ResEnv<>(Constants.RES_STATUS_SUCCESS, msg, object);
	}
	
	public static <T> ResEnv<T> success(String msg){
		return new ResEnv<>(Constants.RES_STATUS_SUCCESS, msg, null);
	}
	
	public static <T> ResEnv<T> success(T object){
		return new ResEnv<>(Constants.RES_STATUS_SUCCESS, Constants.DEF_FAIL_MSG, object);
	}
	
	public static <T> ResEnv<T> success(){
		return success(Constants.DEF_SUCCESS_MSG);
	}
	
	public static <T> ResEnv<T> fail(String msg, int status){
		return new ResEnv<>(status, msg, null);
	}
	
	public static <T> ResEnv<T> fail(String msg){
		return fail(msg, Constants.RES_STATUS_ERROR);
	}
	
	public static <T> ResEnv<T> fail(){
		return fail(Constants.DEF_FAIL_MSG);
	}
	

	public int getStatus() {
		return status;
	}

	public ResEnv setStatus(int status) {
		this.status = status;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResEnv setMessage(String message) {
		this.message = message;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResEnv setData(T data) {
		this.data = data;
		return this;
	}
	
}
