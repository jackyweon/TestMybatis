package com.sctele.tm.db.service.impl;

import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.sctele.tm.common.exception.BusinessException;
import com.sctele.tm.db.service.BaseService;

import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.additional.insert.InsertListMapper;

import java.util.List;

/**
 * serviceImpl继承实现类封装
 *
 * @Title: BaseServiceImpl
 * @Company: sctele
 * @author wenlei
 * @date 2019年2月21日
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public abstract class BaseServiceImpl<T> implements BaseService<T> {

	private static final String IS_NOT_NULL = "%s不能为空！";

	private static final String MAX_LENGTH = "%s超过最大长度%s！";

	@Autowired
	protected Mapper<T> mapper;

	@Autowired
	protected InsertListMapper<T> insertListMapper;
	
	@Autowired
	protected ConditionMapper<T> conditionMapper;

	public Mapper<T> getMapper() {
		return mapper;
	}

	@Override
	public List<T> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public T selectByKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int save(T entity) {
		return mapper.insert(entity);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int delete(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int batchDelete(List<String> list, String property, Class<T> clazz) {
		Example example = new Example(clazz);
		example.createCriteria().andIn(property, list);
		return mapper.deleteByExample(example);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateAll(T entity) {
		return mapper.updateByPrimaryKey(entity);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
	public int updateNotNull(T entity) {
		return mapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public List<T> selectByExample(Object example) {
		return mapper.selectByExample(example);
	}

	@Override
	public int insertList(List<T> recordList) {
		return insertListMapper.insertList(recordList);
	}

	/**
	 * 验证字符串
	 *
	 * @param data
	 * @param length
	 * @param fieldName
	 * @param isRequire
	 */
	protected void validateString(String data, int length, String fieldName, boolean isRequire) {
		if (isRequire && StringUtils.isEmpty(data)) {
			throw new BusinessException(String.format(IS_NOT_NULL, fieldName));
		}
		if (StringUtils.isNotEmpty(data) && data.length() > length) {
			throw new BusinessException(String.format(MAX_LENGTH, fieldName, length));
		}
	}

	/**
	 * 验证list
	 *
	 * @param list
	 * @param isRequire
	 * @param message
	 */
	protected void validateList(List<?> list, boolean isRequire, String message) {
		if (isRequire && CollectionUtils.isEmpty(list)) {
			throw new BusinessException(message);
		}

	}

	/**
	 * 验证对象
	 *
	 * @param object
	 * @param isRequire
	 * @param message
	 */
	protected void validateObject(Object object, boolean isRequire, String message) {
		if (isRequire && object == null) {
			throw new BusinessException(message);
		}
	}

	/**
	 * 验证布尔
	 * 
	 * @param result
	 * @param message
	 */
	protected void validateBoolean(Boolean result, String message) {
		if (result != null && result) {
			throw new BusinessException(message);
		}
	}
}
