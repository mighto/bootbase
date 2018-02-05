package com.boot.base.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.boot.base.utils.DateTimeUtils;
import com.boot.base.utils.SysUtils;

/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月10日
 *************************************
 */

public class SysUtilsTest {

	public static void main(String[] args) {

		Random random = new Random();  
		String result="";  
		for (int i=0;i<5;i++)  
		{  
		    result+=random.nextInt(10);  
		}
		
		System.out.println(result);
	}

}
