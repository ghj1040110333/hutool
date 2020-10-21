package com.tools.extra.template;

import com.tools.core.lang.Dict;
import com.tools.core.util.CharsetUtil;
import com.tools.extra.template.engine.velocity.VelocityEngine;
import org.junit.Assert;
import org.junit.Test;

public class VelocityTest {

	@Test
	public void charsetTest(){
		final TemplateConfig config = new TemplateConfig("templates", TemplateConfig.ResourceMode.CLASSPATH);
		config.setCustomEngine(VelocityEngine.class);
		config.setCharset(CharsetUtil.CHARSET_GBK);
		final TemplateEngine engine = TemplateUtil.createEngine(config);
		Template template = engine.getTemplate("velocity_test_gbk.vtl");
		String result = template.render(Dict.create().set("name", "tools"));
		Assert.assertEquals("你好,tools", result);
	}
}
