package com.tools.extra.ftp;

import com.tools.core.io.FileUtil;
import com.tools.core.io.IoUtil;
import com.tools.core.lang.Console;
import com.tools.extra.ftp.Ftp;
import com.tools.extra.ftp.FtpException;
import com.tools.extra.ssh.Sftp;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class FtpTest {

	@Test
	@Ignore
	public void cdTest() {
		Ftp ftp = new Ftp("looly.centos");

		ftp.cd("/file/aaa");
		Console.log(ftp.pwd());

		IoUtil.close(ftp);
	}

	@Test
	@Ignore
	public void uploadTest() {
		Ftp ftp = new Ftp("looly.centos");

		List<String> ls = ftp.ls("/file");
		Console.log(ls);

		boolean upload = ftp.upload("/file/aaa", FileUtil.file("E:/qrcodeWithLogo.jpg"));
		Console.log(upload);

		IoUtil.close(ftp);
	}

	@Test
	@Ignore
	public void reconnectIfTimeoutTest() throws InterruptedException {
		Ftp ftp = new Ftp("looly.centos");

		Console.log("打印pwd: " + ftp.pwd());

		Console.log("休眠一段时间，然后再次发送pwd命令，抛出异常表明连接超时");
		Thread.sleep(35 * 1000);

		try{
			Console.log("打印pwd: " + ftp.pwd());
		}catch (FtpException e) {
			e.printStackTrace();
		}

		Console.log("判断是否超时并重连...");
		ftp.reconnectIfTimeout();

		Console.log("打印pwd: " + ftp.pwd());

		IoUtil.close(ftp);
	}

	@Test
	@Ignore
	public void recursiveDownloadFolder() {
		Ftp ftp = new Ftp("looly.centos");
		ftp.recursiveDownloadFolder("/",FileUtil.file("d:/test/download"));

		IoUtil.close(ftp);
	}

	@Test
	@Ignore
	public void recursiveDownloadFolderSftp() {
		Sftp ftp = new Sftp("127.0.0.1", 22, "test", "test");

		ftp.cd("/file/aaa");
		Console.log(ftp.pwd());
		ftp.recursiveDownloadFolder("/",FileUtil.file("d:/test/download"));

		IoUtil.close(ftp);
	}
}
