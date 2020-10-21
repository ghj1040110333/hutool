package com.tools.db.dialect.impl;

import com.tools.db.dialect.DialectName;
import com.tools.db.sql.Wrapper;

/**
 * SqlLite3方言
 * @author loolly
 *
 */
public class Sqlite3Dialect extends AnsiSqlDialect{
	private static final long serialVersionUID = -3527642408849291634L;

	public Sqlite3Dialect() {
		wrapper = new Wrapper('[', ']');
	}

	@Override
	public DialectName dialectName() {
		return DialectName.SQLITE3;
	}
}
