package com.tools.core.text.csv;

import com.tools.core.io.FileUtil;
import com.tools.core.lang.Assert;
import com.tools.core.util.CharsetUtil;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class CsvUtilTest {

	@Test
	public void readTest() {
		CsvReader reader = CsvUtil.getReader();
		//从文件中读取CSV数据
		CsvData data = reader.read(FileUtil.file("test.csv"));
		List<CsvRow> rows = data.getRows();
		for (CsvRow csvRow : rows) {
			Assert.notEmpty(csvRow.getRawList());
		}
	}

	@Test
	public void readTest2() {
		CsvReader reader = CsvUtil.getReader();
		reader.read(FileUtil.getUtf8Reader("test.csv"), (csvRow)-> Assert.notEmpty(csvRow.getRawList()));
	}

	@Test
	@Ignore
	public void writeTest() {
		CsvWriter writer = CsvUtil.getWriter("e:/testWrite.csv", CharsetUtil.CHARSET_UTF_8);
		writer.write(
				new String[] {"a1", "b1", "c1", "123345346456745756756785656"},
				new String[] {"a2", "b2", "c2"},
				new String[] {"a3", "b3", "c3"}
		);
	}

}
