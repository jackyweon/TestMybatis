package com.sctele.tm.db.gen;

import java.util.UUID;

import tk.mybatis.mapper.genid.GenId;

/**
 * UUID生成
 *
 * @title: UUIdGenId
 * @company: sctele
 * @author wenlei
 * @date 2019年4月28日
 */
public class UUIdGenId implements GenId<String> {

	@Override
	public String genId(String s, String s1) {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
