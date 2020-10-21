package com.tools.extra.qrcode;

import com.tools.core.codec.Base64;
import com.tools.core.io.FileUtil;
import com.tools.core.lang.Console;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * 二维码工具类单元测试
 *
 * @author looly
 *
 */
public class QrCodeUtilTest {

	@Test
	public void generateTest() {
		final BufferedImage image = QrCodeUtil.generate("https://tools.cn/", 300, 300);
		Assert.assertNotNull(image);
	}

	@Test
	@Ignore
	public void generateCustomTest() {
		QrConfig config = new QrConfig();
		config.setMargin(0);
		config.setForeColor(Color.CYAN);
		// 背景色透明
		config.setBackColor(null);
		config.setErrorCorrection(ErrorCorrectionLevel.H);
		QrCodeUtil.generate("https://tools.cn/", config, FileUtil.file("d:/qrcodeCustom.png"));
	}

	@Test
	@Ignore
	public void generateWithLogoTest() {
		QrCodeUtil.generate(//
				"http://tools.cn/", //
				QrConfig.create().setImg("e:/pic/face.jpg"), //
				FileUtil.file("e:/qrcodeWithLogo.jpg"));
	}

	@Test
	@Ignore
	public void decodeTest() {
		String decode = QrCodeUtil.decode(FileUtil.file("e:/pic/qr.png"));
		Console.log(decode);
	}

	@Test
	@Ignore
	public void generateAsBase64Test(){
		String base64 = QrCodeUtil.generateAsBase64("http://tools.cn/", new QrConfig(400, 400), "png");
		System.out.println(base64);

		byte[] bytes = FileUtil.readBytes(
			new File("d:/test/qr.png"));
		String encode = Base64.encode(bytes);
		String base641 = QrCodeUtil.generateAsBase64("http://tools.cn/", new QrConfig(400, 400), "png", encode);
		System.out.println(base641);

	}

}
