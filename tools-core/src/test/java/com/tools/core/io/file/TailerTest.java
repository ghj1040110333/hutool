package com.tools.core.io.file;

import com.tools.core.io.file.Tailer;
import org.junit.Ignore;
import org.junit.Test;

import com.tools.core.io.FileUtil;
import com.tools.core.util.CharsetUtil;

public class TailerTest {

	@Test
	@Ignore
	public void tailTest() {
		FileUtil.tail(FileUtil.file("e:/tail.txt"), CharsetUtil.CHARSET_GBK);
	}

	@Test
	@Ignore
	public void tailWithLinesTest() {
		Tailer tailer = new Tailer(FileUtil.file("f:/test/test.log"), Tailer.CONSOLE_HANDLER, 2);
		tailer.start();
	}
}
