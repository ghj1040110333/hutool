package com.tools.core.convert.impl;

import java.util.UUID;

import com.tools.core.convert.AbstractConverter;
import com.tools.core.convert.AbstractConverter;

/**
 * UUID对象转换器转换器
 *
 * @author Looly
 * @since 4.0.10
 *
 */
public class UUIDConverter extends AbstractConverter<UUID> {
	private static final long serialVersionUID = 1L;

	@Override
	protected UUID convertInternal(Object value) {
		return UUID.fromString(convertToStr(value));
	}

}
