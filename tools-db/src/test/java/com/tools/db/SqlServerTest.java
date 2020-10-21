package com.tools.db;

import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;

import com.tools.core.lang.Console;
import com.tools.db.Db;
import com.tools.db.Entity;
import com.tools.db.Page;
import com.tools.db.PageResult;

/**
 * SQL Server操作单元测试
 *
 * @author looly
 *
 */
public class SqlServerTest {

	@Test
	@Ignore
	public void createTableTest() throws SQLException {
		Db.use("sqlserver").execute("create table T_USER(ID bigint, name varchar(255))");
	}

	@Test
	@Ignore
	public void insertTest() throws SQLException {
		for (int id = 100; id < 200; id++) {
			Db.use("sqlserver").insert(Entity.create("T_USER")//
					.set("ID", id)//
					.set("name", "测试用户" + id)//
			);
		}
	}

	@Test
	@Ignore
	public void pageTest() throws SQLException {
		PageResult<Entity> result = Db.use("sqlserver").page(Entity.create("T_USER"), new Page(2, 10));
		for (Entity entity : result) {
			Console.log(entity.get("ID"));
		}
	}

}
