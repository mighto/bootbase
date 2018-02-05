package com.boot.base.utils;

import java.util.UUID;

/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月10日
 *************************************
 */

public class SysUtils {
	
	public static String uid() {
		String uid = UUID.randomUUID().toString();
//		return uid;
		return uid.replaceAll("-", "");
	}

}
