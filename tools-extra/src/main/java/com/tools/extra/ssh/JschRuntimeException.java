package com.tools.extra.ssh;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StringUtil;

/**
 * Jsch异常
 * @author fruit
 */
public class JschRuntimeException extends RuntimeException{
	private static final long serialVersionUID = 8247610319171014183L;

	public JschRuntimeException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public JschRuntimeException(String message) {
		super(message);
	}

	public JschRuntimeException(String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params));
	}

	public JschRuntimeException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public JschRuntimeException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params), throwable);
	}
}
