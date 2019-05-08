package com.sctele.tm.common.exception;

/**
 * 自定义业务异常
 * 
 * @Title: BusinessException
 * @Company: sctele
 * @author wenlei
 * @date 2019年2月21日
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	public BusinessException(String message) {
		super();
		this.message = message;
	}

	/**
	 * 
	 * @return message
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
