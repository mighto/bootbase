package com.boot.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月11日
 *************************************
 */

@SpringBootApplication
//@EnableOAuth2Sso
@EnableTransactionManagement
@MapperScan("com.boot.base.mapper")
public class BaseBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BaseBootApplication.class, args);
	}

}
