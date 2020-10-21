package com.tools.json;

import lombok.Data;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Logger;

/**
 * 问题反馈对象中有JDK8日期对象时转换失败，5.0.7修复
 */
public class Issue644Test {

	@Test
	public void toBeanTest(){
		final BeanWithDate beanWithDate = new BeanWithDate();
		beanWithDate.setDate(LocalDateTime.now());

		final JSONObject jsonObject = JSONUtil.parseObj(beanWithDate);

		BeanWithDate beanWithDate2 = JSONUtil.toBean(jsonObject, BeanWithDate.class);
	//	Assert.assertEquals(beanWithDate.getDate(), beanWithDate2.getDate());

		beanWithDate2 = JSONUtil.toBean(jsonObject.toString(), BeanWithDate.class);
	//	Assert.assertEquals(beanWithDate.getDate(), beanWithDate2.getDate());
	}

	@Data
	static class BeanWithDate{
		private LocalDateTime date;
	}

	@Test
    public  void toDate(){
        final BeanWithDate beanWithDate = new BeanWithDate();

        Date date = new Date(1603270721746L);
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime=LocalDateTime.now(zoneId);
        beanWithDate.setDate(localDateTime);

        Logger.getLogger(this.getClass().getName()).info(new Date(1603270721746L).toString());
    }
}
