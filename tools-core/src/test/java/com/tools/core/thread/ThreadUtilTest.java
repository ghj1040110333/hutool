package com.tools.core.thread;

import com.tools.core.thread.ThreadUtil;
import org.junit.Assert;
import org.junit.Test;

public class ThreadUtilTest {

	@Test
	public void executeTest() {
		final boolean isValid = true;

		ThreadUtil.execute(() -> Assert.assertTrue(isValid));
	}
}
