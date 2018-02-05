package com.boot.base.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 功能描述: 日期时间工具类
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月10日
 *************************************
 */

public class DateTimeUtils {
	
	public static final SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * 已字符串的形式 获取 当前时间
	 * @return
	 */
	public static String getNowDate() {
		return longSdf.format(new Date());
	}
	
	/**
	 * 某一天是 一年中的 第几天
	 * @param date
	 * @return
	 */
	public static Long getWeekOfYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int week = calendar.get(Calendar.WEEK_OF_YEAR);
		return Long.valueOf(week);
	}
	
	/**
	 * 获取 某一天 的开始时间
	 * @param date date yyyy-MM-dd xx:xx:xx.xxx
	 * @return date yyyy-MM-dd 00:00:00.000
	 */
	public static Date startOfDay(Date date) {
//		使用默认时区和语言环境获得一个日历。
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		setStartOfDay(calendar);
		return calendar.getTime();
	}
	
	private static void setStartOfDay(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
	}
	
	/**
	 * 获取 某一天 的结束时间
	 * @param date yyyy-MM-dd xx:xx:xx.xxx
	 * @return date yyyy-MM-dd 23:59:59.999
	 */
	public static Date endOfDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		setEndOfDay(calendar);
		return calendar.getTime();
	}
	
	private static void setEndOfDay(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
	}

}
