package com.tools.db.nosql;

import com.tools.db.nosql.redis.RedisDS;
import org.junit.Ignore;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisDSTest {

	@Test
	@Ignore
	public void redisDSTest(){
		final Jedis jedis = RedisDS.create().getJedis();
	}
}
