package com.sctele.tm.common.domain;

import java.io.Serializable;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 分页参数封装
 * 
 * @Title: PageVo
 * @Company: sctele
 * @author wenlei
 * @date 2019年2月21日
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageVo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 页码，第几页
	 */
	@Transient
	private int pageNum;

	/**
	 * 每页记录数
	 */
	@Transient
	private int pageSize;

	/**
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}

	/**
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
