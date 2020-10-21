package com.tools.http.server;

import com.tools.core.swing.DesktopUtil;
import com.tools.http.ContentType;
import com.tools.http.HttpUtil;

public class BlankServerTest {
	public static void main(String[] args) {
		HttpUtil.createServer(8888)
				.addAction("/", (req, res)-> res.write("Hello tools Server", ContentType.JSON.getValue()))
				.start();

		DesktopUtil.browse("http://localhost:8888/");
	}
}
