package com.tools.cron.demo;

import com.tools.core.lang.Console;
import com.tools.core.thread.ThreadUtil;
import com.tools.cron.CronUtil;
import com.tools.cron.TaskExecutor;
import com.tools.cron.listener.TaskListener;
import com.tools.cron.task.Task;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 定时任务样例
 */
public class CronTest {

	@Test
	@Ignore
	public void customCronTest() {
		CronUtil.schedule("*/2 * * * * *", (Task) () -> Console.log("Task excuted."));

		// 支持秒级别定时任务
		CronUtil.setMatchSecond(true);
		CronUtil.start();
	}

	@Test
	@Ignore
	public void cronTest() {
		// 支持秒级别定时任务
		CronUtil.setMatchSecond(true);
		CronUtil.getScheduler().setDaemon(false);
		CronUtil.start();

		ThreadUtil.sleep(3000);
		CronUtil.stop();
	}

	@Test
	@Ignore
	public void cronTest2() {
		CronUtil.getScheduler().addListener(new TaskListener() {
			@Override
			public void onStart(TaskExecutor executor) {
				Console.log("Listen task start!");
			}

			@Override
			public void onSucceeded(TaskExecutor executor) {

			}

			@Override
			public void onFailed(TaskExecutor executor, Throwable exception) {

			}
		});

		// 支持秒级别定时任务
		CronUtil.setMatchSecond(true);
		CronUtil.start();

		ThreadUtil.waitForDie();
		Console.log("Exit.");
	}

	@Test
//	@Ignore
	public void addAndRemoveTest() {
		String id = CronUtil.schedule("*/2 * * * * *", (Runnable) () -> Console.log("task running : 2s"));

		Console.log(id);
		CronUtil.remove(id);

		// 支持秒级别定时任务
		CronUtil.setMatchSecond(true);
		CronUtil.start();
	}
}
