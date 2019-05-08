package com.sctele.tm.db.mapper;

import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertUseGeneratedKeysMapper;

/**
 * 自定义mapper，所有mapper的父接口
 *
 * @Title: MyMapper
 * @Company: sctele
 * @author wenlei
 * @date 2019年2月21日
 */
public interface MyMapper<T> extends Mapper<T>,InsertListMapper<T>,InsertUseGeneratedKeysMapper<T>,ConditionMapper<T>{

}