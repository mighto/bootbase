package com.boot.base.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * 功能描述:
 * 作者: mistaker
 * 邮箱: 2029635554@qq.com
 * 创建时间: 2018年2月2日
 *************************************
 */

public interface TestMapper {
	
	@Select("SELECT shuos FROM qz_shuo WHERE id = #{id}")
	String testSql(int id);

}
