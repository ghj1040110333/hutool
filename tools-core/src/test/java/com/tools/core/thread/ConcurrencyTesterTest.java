package com.tools.core.thread;

import com.tools.core.thread.ConcurrencyTester;
import com.tools.core.thread.ThreadUtil;
import org.junit.Ignore;
import org.junit.Test;

import com.tools.core.lang.Console;
import com.tools.core.util.RandomUtil;

public class ConcurrencyTesterTest {

	@Test
	@Ignore
	public void concurrencyTesterTest() {
		ConcurrencyTester tester = ThreadUtil.concurrencyTest(100, () -> {
			long delay = RandomUtil.randomLong(100, 1000);
			ThreadUtil.sleep(delay);
			Console.log("{} test finished, delay: {}", Thread.currentThread().getName(), delay);
		});
		Console.log(tester.getInterval());
	}
}
