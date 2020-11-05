package com.tools.extra.template.engine.velocity;

import com.tools.core.convert.Convert;
import com.tools.core.io.IoUtil;
import com.tools.core.lang.TypeReference;
import com.tools.core.util.CharsetUtil;
import com.tools.core.util.StringUtil;
import com.tools.extra.template.AbstractTemplate;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.util.Map;

/**
 * Velocity模板包装
 *
 * @author looly
 *
 */
public class VelocityTemplate extends AbstractTemplate implements Serializable {
	private static final long serialVersionUID = -132774960373894911L;

	private final org.apache.velocity.Template rawTemplate;
	private String charset;

	/**
	 * 包装Velocity模板
	 *
	 * @param template Velocity的模板对象 {@link org.apache.velocity.Template}
	 * @return {@link VelocityTemplate}
	 */
	public static VelocityTemplate wrap(org.apache.velocity.Template template) {
		return (null == template) ? null : new VelocityTemplate(template);
	}

	/**
	 * 构造
	 *
	 * @param rawTemplate Velocity模板对象
	 */
	public VelocityTemplate(org.apache.velocity.Template rawTemplate) {
		this.rawTemplate = rawTemplate;
	}

	@Override
	public void render(Map<?, ?> bindingMap, Writer writer) {
		rawTemplate.merge(toContext(bindingMap), writer);
		IoUtil.flush(writer);
	}

	@Override
	public void render(Map<?, ?> bindingMap, OutputStream out) {
		if(null == charset) {
			loadEncoding();
		}
		render(bindingMap, IoUtil.getWriter(out, this.charset));
	}

	/**
	 * 将Map转为VelocityContext
	 *
	 * @param bindingMap 参数绑定的Map
	 * @return {@link VelocityContext}
	 */
	private VelocityContext toContext(Map<?, ?> bindingMap) {
		final Map<String, Object> map = Convert.convert(new TypeReference<Map<String, Object>>() {}, bindingMap);
		return new VelocityContext(map);
	}

	/**
	 * 加载可用的Velocity中预定义的编码
	 */
	private void loadEncoding() {
		final String charset = (String) Velocity.getProperty(Velocity.INPUT_ENCODING);
		this.charset = StringUtil.isEmpty(charset) ? CharsetUtil.UTF_8 : charset;
	}
}