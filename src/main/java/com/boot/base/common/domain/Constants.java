package com.boot.base.common.domain;


/**
 * 功能描述: 常量
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月11日
 *************************************
 */

public class Constants {
	
	/**
	 * 默认成功消息
	 */
	public static final String DEF_SUCCESS_MSG = "操作成功";
	
	/**
	 * 默认失败消息
	 */
	public static final String DEF_FAIL_MSG = "操作失败";
	
	/**
	 * 返回状态：成功
	 */
	public static final int RES_STATUS_SUCCESS = 200;
	
	/**
	 * 返回状态：参数异常
	 */
	public static final int RES_STATUS_INVALID_PARAM = 400;
	
	/**
	 * 返回状态：不存在
	 */
	public static final int RES_STATUS_NOT_FOUND = 404;

	/**
	 * 返回状态：失败
	 */
	public static final int RES_STATUS_ERROR = 503;
	
	/**
	 * 返回状态：服务异常
	 */
	public static final int RES_STATUS_SERVER_ERROR = 500;
}
