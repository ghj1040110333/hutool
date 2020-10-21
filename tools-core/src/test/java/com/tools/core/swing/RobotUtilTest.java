package com.tools.core.swing;

import com.tools.core.swing.RobotUtil;
import org.junit.Ignore;
import org.junit.Test;

import com.tools.core.io.FileUtil;

public class RobotUtilTest {

	@Test
	@Ignore
	public void captureScreenTest() {
		RobotUtil.captureScreen(FileUtil.file("e:/screen.jpg"));
	}
}
