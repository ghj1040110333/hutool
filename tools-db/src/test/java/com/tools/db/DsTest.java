package com.tools.db;

import com.tools.core.collection.CollUtil;
import com.tools.db.ds.DSFactory;
import com.tools.db.ds.bee.BeeDSFactory;
import com.tools.db.ds.c3p0.C3p0DSFactory;
import com.tools.db.ds.dbcp.DbcpDSFactory;
import com.tools.db.ds.druid.DruidDSFactory;
import com.tools.db.ds.hikari.HikariDSFactory;
import com.tools.db.ds.pooled.PooledDSFactory;
import com.tools.db.ds.tomcat.TomcatDSFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * 数据源单元测试
 *
 * @author Looly
 *
 */
public class DsTest {

	@Test
	public void defaultDsTest() throws SQLException {
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void hikariDsTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new HikariDSFactory());
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void druidDsTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new DruidDSFactory());
		DataSource ds = DSFactory.get("test");

		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void tomcatDsTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new TomcatDSFactory());
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void beeCPDsTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new BeeDSFactory());
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void dbcpDsTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new DbcpDSFactory());
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void c3p0DsTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new C3p0DSFactory());
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}

	@Test
	public void toolsPoolTest() throws SQLException {
		DSFactory.setCurrentDSFactory(new PooledDSFactory());
		DataSource ds = DSFactory.get("test");
		Db db = Db.use(ds);
		List<Entity> all = db.findAll("user");
		Assert.assertTrue(CollUtil.isNotEmpty(all));
	}
}
