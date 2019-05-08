package com.sctele.tm.db.service;

import java.util.List;

/**
 * service继承接口封装
 *
 * @Title: BaseService
 * @Company: sctele
 * @author wenlei
 * @date 2019年2月21日
 */
public interface BaseService<T> {

	/**
	 * 查询全部
	 *
	 * @return
	 */
	List<T> selectAll();

	/**
	 * 通过key查询对象
	 *
	 * @param key
	 * @return
	 */
	T selectByKey(Object key);

	/**
	 * 保存对象
	 *
	 * @param entity
	 * @return
	 */
	int save(T entity);

	/**
	 * 通过key删除单个对象
	 *
	 * @param key
	 * @return
	 */
	int delete(Object key);

	/**
	 * 通过idList删除多个对象
	 *
	 * @param list
	 * @param property
	 * @param clazz
	 * @return
	 */
	int batchDelete(List<String> list, String property, Class<T> clazz);

	/**
	 * 更新对象
	 *
	 * @param entity
	 * @return
	 */
	int updateAll(T entity);

	/**
	 * 更新对象，会对字段进行判断再更新(如果为Null就忽略更新)
	 *
	 * @param entity
	 * @return
	 */
	int updateNotNull(T entity);

	/**
	 * 根据条件封装查询数据
	 *
	 * @param example
	 * @return
	 */
	List<T> selectByExample(Object example);
	
	/**
	 * <p>批量插入</p>
	 * <p>1.如果主键为UUID，在主键属性上指定UUID生成策略</p>
	 * <p>2.如果主键为自增长，数据库为主键勾选自增长</p>
	 *  
	 * @param recordList
	 * @return
	 */
	int insertList(List<T> recordList);
	
}