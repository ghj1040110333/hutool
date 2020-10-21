package com.tools.extra.pinyin;

import com.tools.core.exceptions.ExceptionUtil;
import com.tools.core.util.StrUtil;

/**
 * 模板异常
 *
 * @author xiaoleilu
 */
public class PinyinException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PinyinException(Throwable e) {
		super(ExceptionUtil.getMessage(e), e);
	}

	public PinyinException(String message) {
		super(message);
	}

	public PinyinException(String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params));
	}

	public PinyinException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public PinyinException(Throwable throwable, String messageTemplate, Object... params) {
		super(StrUtil.format(messageTemplate, params), throwable);
	}
}
