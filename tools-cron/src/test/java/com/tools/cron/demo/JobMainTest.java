package com.tools.cron.demo;

import com.tools.cron.CronUtil;

/**
 * 定时任务样例
 */
public class JobMainTest {

	public static void main(String[] args) {
		CronUtil.setMatchSecond(true);
		CronUtil.start(false);
	}
}
