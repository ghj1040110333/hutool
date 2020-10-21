package com.tools.poi.exceptions;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StrUtil;

/**
 * POI异常
 * @author xiaoleilu
 */
public class POIException extends RuntimeException{
	private static final long serialVersionUID = 2711633732613506552L;

	public POIException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public POIException(String message) {
		super(message);
	}

	public POIException(String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}

	public POIException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public POIException(Throwable throwable, String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params), throwable);
	}
}
