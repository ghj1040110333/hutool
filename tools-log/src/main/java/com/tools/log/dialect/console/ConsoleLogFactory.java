package com.tools.log.dialect.console;

import com.tools.log.Log;
import com.tools.log.LogFactory;

/**
 * 利用System.out.println()打印日志
 * @author Looly
 *
 */
public class ConsoleLogFactory extends LogFactory {

	public ConsoleLogFactory() {
		super("tools Console Logging");
	}

	@Override
	public Log createLog(String name) {
		return new ConsoleLog(name);
	}

	@Override
	public Log createLog(Class<?> clazz) {
		return new ConsoleLog(clazz);
	}

}
