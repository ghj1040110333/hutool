package com.tools.socket.aio;

import com.tools.core.lang.Console;
import com.tools.core.util.StringUtil;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public class AioClientTest {
	public static void main(String[] args) {
		AioClient client = new AioClient(new InetSocketAddress("localhost", 8899), new SimpleIoAction() {

			@Override
			public void doAction(AioSession session, ByteBuffer data) {
				if(data.hasRemaining()) {
					Console.log(StringUtil.utf8Str(data));
					session.read();
				}
				Console.log("OK");
			}
		});

		client.write(ByteBuffer.wrap("Hello".getBytes()));
		client.read();

		client.close();
	}
}
