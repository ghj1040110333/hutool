package com.tools.db.dialect.impl;

import com.tools.db.Page;
import com.tools.db.dialect.DialectName;
import com.tools.db.sql.SqlBuilder;

/**
 * H2数据库方言
 *
 * @author loolly
 */
public class H2Dialect extends AnsiSqlDialect {
	private static final long serialVersionUID = 1490520247974768214L;

	public H2Dialect() {
//		wrapper = new Wrapper('"');
	}

	@Override
	public DialectName dialectName() {
		return DialectName.H2;
	}

	@Override
	protected SqlBuilder wrapPageSql(SqlBuilder find, Page page) {
		// limit A , B 表示：A就是查询的起点位置，B就是你需要多少行。
		return find.append(" limit ").append(page.getStartPosition()).append(" , ").append(page.getPageSize());
	}
}
