package com.boot.base.common.exception;


/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月11日
 *************************************
 */

public class BizException extends RuntimeException {
	
	private static final long serialVersionUID = 7177549176140059612L;
	
	private Integer status;
	
	public BizException() {
		super();
	}
	
	public BizException(String message) {
		super(message);
	}
	
	public BizException(String message, int status) {
		super(message);
		this.status = status;
	}
	
	public BizException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public BizException(String message, Throwable cause, int status) {
		super(message, cause);
		this.status = status;
	}
	
	public BizException(Throwable cause, int status) {
		super(cause);
		this.status = status;
	}
	
	public BizException(Throwable cause) {
		super(cause);
	}
	
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
