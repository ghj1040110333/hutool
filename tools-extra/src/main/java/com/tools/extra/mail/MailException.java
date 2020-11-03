package com.tools.extra.mail;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StringUtil;

/**
 * 邮件异常
 * @author fruit
 */
public class MailException extends RuntimeException{
	private static final long serialVersionUID = 8247610319171014183L;

	public MailException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public MailException(String message) {
		super(message);
	}

	public MailException(String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params));
	}

	public MailException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public MailException(Throwable throwable, String messageTemplate, Object... params) {
		super(StringUtil.format(messageTemplate, params), throwable);
	}
}
