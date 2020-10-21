package com.tools.core.convert;

import com.tools.core.convert.Convert;
import org.junit.Assert;
import org.junit.Test;

import java.util.TimeZone;

public class StringConvertTest {

	@Test
	public void timezoneToStrTest(){
		final String s = Convert.toStr(TimeZone.getTimeZone("Asia/Shanghai"));
		Assert.assertEquals("Asia/Shanghai", s);
	}
}
