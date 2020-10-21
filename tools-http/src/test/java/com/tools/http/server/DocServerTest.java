package com.tools.http.server;

import com.tools.core.swing.DesktopUtil;
import com.tools.http.HttpUtil;

public class DocServerTest {

	public static void main(String[] args) {
		HttpUtil.createServer(80)
				// 设置默认根目录，
				.setRoot("D:\\workspace\\site\\tools-site")
				.start();

		DesktopUtil.browse("http://localhost/");
	}
}
