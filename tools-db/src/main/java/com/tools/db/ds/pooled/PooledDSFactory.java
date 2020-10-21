package com.tools.db.ds.pooled;

import com.tools.core.util.StrUtil;
import com.tools.db.ds.AbstractDSFactory;
import com.tools.setting.Setting;

import javax.sql.DataSource;

/**
 * tools自身实现的池化数据源工厂类
 *
 * @author Looly
 *
 */
public class PooledDSFactory extends AbstractDSFactory {
	private static final long serialVersionUID = 8093886210895248277L;

	public static final String DS_NAME = "tools-Pooled-DataSource";

	public PooledDSFactory() {
		this(null);
	}

	public PooledDSFactory(Setting setting) {
		super(DS_NAME, PooledDataSource.class, setting);
	}

	@Override
	protected DataSource createDataSource(String jdbcUrl, String driver, String user, String pass, Setting poolSetting) {
		final DbConfig dbConfig = new DbConfig();
		dbConfig.setUrl(jdbcUrl);
		dbConfig.setDriver(driver);
		dbConfig.setUser(user);
		dbConfig.setPass(pass);

		// 连接池相关信息
		dbConfig.setInitialSize(poolSetting.getInt("initialSize", 0));
		dbConfig.setMinIdle(poolSetting.getInt("minIdle", 0));
		dbConfig.setMaxActive(poolSetting.getInt("maxActive", 8));
		dbConfig.setMaxWait(poolSetting.getLong("maxWait", 6000L));

		// remarks等特殊配置，since 5.3.8
		String connValue;
		for (String key : KEY_CONN_PROPS) {
			connValue = poolSetting.get(key);
			if(StrUtil.isNotBlank(connValue)){
				dbConfig.addConnProps(key, connValue);
			}
		}

		return new PooledDataSource(dbConfig);
	}
}
