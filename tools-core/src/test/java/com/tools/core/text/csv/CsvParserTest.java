package com.tools.core.text.csv;

import com.tools.core.io.IoUtil;
import com.tools.core.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class CsvParserTest {

	@Test
	public void parseTest1() {
		StringReader reader = StringUtil.getReader("aaa,b\"bba\",ccc");
		CsvParser parser = new CsvParser(reader, null);
		CsvRow row = parser.nextRow();
		//noinspection ConstantConditions
		Assert.assertEquals("b\"bba\"", row.getRawList().get(1));
		IoUtil.close(parser);
	}

	@Test
	public void parseTest2() {
		StringReader reader = StringUtil.getReader("aaa,\"bba\"bbb,ccc");
		CsvParser parser = new CsvParser(reader, null);
		CsvRow row = parser.nextRow();
		//noinspection ConstantConditions
		Assert.assertEquals("\"bba\"bbb", row.getRawList().get(1));
		IoUtil.close(parser);
	}

	@Test
	public void parseTest3() {
		StringReader reader = StringUtil.getReader("aaa,\"bba\",ccc");
		CsvParser parser = new CsvParser(reader, null);
		CsvRow row = parser.nextRow();
		//noinspection ConstantConditions
		Assert.assertEquals("bba", row.getRawList().get(1));
		IoUtil.close(parser);
	}

	@Test
	public void parseTest4() {
		StringReader reader = StringUtil.getReader("aaa,\"\",ccc");
		CsvParser parser = new CsvParser(reader, null);
		CsvRow row = parser.nextRow();
		//noinspection ConstantConditions
		Assert.assertEquals("", row.getRawList().get(1));
		IoUtil.close(parser);
	}
}
