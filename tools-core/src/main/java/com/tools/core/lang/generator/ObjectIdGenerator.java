package com.tools.core.lang.generator;

import com.tools.core.lang.ObjectId;

/**
 * ObjectId生成器
 *
 * @author looly
 * @since 5.4.3
 */
public class ObjectIdGenerator implements Generator<String> {
	@Override
	public String next() {
		return ObjectId.next();
	}
}
