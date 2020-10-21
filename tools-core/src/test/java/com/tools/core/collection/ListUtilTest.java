package com.tools.core.collection;

import com.tools.core.date.StopWatch;
import com.tools.core.lang.Console;
import com.tools.core.util.RandomUtil;
import com.tools.core.collection.CollUtil;
import com.tools.core.collection.ListUtil;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListUtilTest {

	@Test
	@Ignore
	public void split() {
		List<String> list = new ArrayList<>();
		CollUtil.padRight(list, RandomUtil.randomInt(1000_0000, 1_0000_0000), "test");

		int size = RandomUtil.randomInt(10, 1000);
		Console.log("\nlist size: {}", list.size());
		Console.log("partition size: {}\n", size);
		StopWatch stopWatch = new StopWatch();

		stopWatch.start("CollUtil#split");
		List<List<String>> CollSplitResult = CollUtil.split(list, size);
		stopWatch.stop();

		stopWatch.start("ListUtil#split");
		List<List<String>> ListSplitResult = ListUtil.split(list, size);
		stopWatch.stop();

		Assert.assertEquals(CollSplitResult, ListSplitResult);

		Console.log(stopWatch.prettyPrint());
	}

	@Test
	public void filterTest(){
		List<String> a = ListUtil.toLinkedList("1", "2", "3");
		final List<String> filter = ListUtil.filter(a, str -> "edit" + str);
		Assert.assertEquals("edit1", filter.get(0));
		Assert.assertEquals("edit2", filter.get(1));
		Assert.assertEquals("edit3", filter.get(2));
	}

	@Test
	public void indexOfAll() {
		List<String> a = ListUtil.toLinkedList("1", "2", "3", "4", "3", "2", "1");
		final int[] indexArray = ListUtil.indexOfAll(a, "2"::equals);
		Assert.assertArrayEquals(new int[]{1,5}, indexArray);
		final int[] indexArray2 = ListUtil.indexOfAll(a, "1"::equals);
		Assert.assertArrayEquals(new int[]{0,6}, indexArray2);
	}
}
