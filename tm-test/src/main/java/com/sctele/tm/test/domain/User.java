package com.sctele.tm.test.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sctele.tm.db.gen.UUIdGenId;

import tk.mybatis.mapper.annotation.KeySql;

/**
 * 
 * @title: User
 * @company: sctele
 * @author wenlei
 * @date 2019年4月25日
 */
@Table(name = "t_user")
public class User {

	@Id
	@KeySql(genId = UUIdGenId.class)
	private String id;

	/**
	 * 
	 */
	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "sex")
	private Integer sex;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
