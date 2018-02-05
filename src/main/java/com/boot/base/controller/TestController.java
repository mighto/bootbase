package com.boot.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.boot.base.common.domain.ResEnv;
import com.boot.base.mapper.TestMapper;

/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年1月11日
 *************************************
 */

@RestController
@RequestMapping("/test")
public class TestController extends WebApplicationContextUtils{
	
	@Autowired
	TestMapper testMapper;
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable String id) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return "product id:" + id;
	}

	@GetMapping("/order/{id}")
	public ResEnv<String> a(@PathVariable String id){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return ResEnv.success("order id:" + id);
	}
	
	@GetMapping("/sql")
	public ResEnv<String> testSql(){
		return ResEnv.success(testMapper.testSql(1));
	}
	
}
