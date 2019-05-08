package com.sctele.tm.common.domain;

/**
 * 请求结果封装类
 *
 * @Title: ResponseBo
 * @Company: sctele
 * @author wenlei
 * @date 2019年3月15日
 */
public class ResponseBo<T> {

	/**
	 * 状态码-成功
	 */
	public final static int CODE_200 = 200;
	/**
	 * 状态码-未登录
	 */
	public final static int CODE_401 = 401;
	/**
	 * 状态码-无权限
	 */
	public final static int CODE_403 = 403;
	/**
	 * 状态码-异常
	 */
	public final static int CODE_500 = 500;

	/**
	 * 状态码
	 */
	private int code;

	/**
	 * 是否成功
	 */
	private boolean isSuccess = true;

	/**
	 * 返回消息
	 */
	private String message = "操作成功！";

	/**
	 * 数据总数
	 */
	private Long total;

	/**
	 * 数据
	 */
	private T data;

	/**
	 * 成功
	 *
	 * @Title: success
	 * @data: 2019年3月15日
	 * @author wenlei
	 * @return
	 */
	public static <T> ResponseBo<T> success() {
		ResponseBo<T> result = new ResponseBo<T>();
		result.setCode(CODE_200);
		return result;
	}

	/**
	 * 成功，并放入数据
	 *
	 * @Title: success
	 * @data: 2019年3月15日
	 * @author wenlei
	 * @param data
	 * @return
	 */
	public static <T> ResponseBo<T> success(T data) {
		ResponseBo<T> result = new ResponseBo<T>();
		result.setCode(CODE_200);
		result.setData(data);
		return result;
	}

	/**
	 * 成功，并放入数据和数据总数
	 *
	 * @Title: success
	 * @data: 2019年3月15日
	 * @author wenlei
	 * @param data
	 * @param total
	 * @return
	 */
	public static <T> ResponseBo<T> success(T data, long total) {
		ResponseBo<T> result = new ResponseBo<T>();
		result.setCode(CODE_200);
		result.setData(data);
		result.setTotal(total);
		return result;
	}

	/**
	 * 失败
	 *
	 * @Title: error
	 * @data: 2019年3月15日
	 * @author wenlei
	 * @return
	 */
	public static <T> ResponseBo<T> error() {
		ResponseBo<T> result = new ResponseBo<T>();
		result.setIsSuccess(false);
		result.setCode(CODE_500);
		result.setMessage("操作失败，请联系管理员！");
		return result;
	}

	/**
	 * 失败，设置错误消息
	 *
	 * @Title: error
	 * @data: 2019年3月15日
	 * @author wenlei
	 * @param message
	 * @return
	 */
	public static <T> ResponseBo<T> error(String message) {
		ResponseBo<T> result = new ResponseBo<T>();
		result.setIsSuccess(false);
		result.setCode(CODE_500);
		result.setMessage(message);
		return result;
	}

	/**
	 * 失败，设置错误消息和状态码
	 *
	 * @Title: error
	 * @data: 2019年3月15日
	 * @author wenlei
	 * @param message
	 * @param code
	 * @return
	 */
	public static <T> ResponseBo<T> error(String message, int code) {
		ResponseBo<T> result = new ResponseBo<T>();
		result.setIsSuccess(false);
		result.setCode(code);
		result.setMessage(message);
		return result;
	}

	/**
	 * 
	 * @return code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * 
	 * @return isSuccess
	 */
	public boolean getIsSuccess() {
		return isSuccess;
	}

	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	/**
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 
	 * @return total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * 
	 * @return data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

}
