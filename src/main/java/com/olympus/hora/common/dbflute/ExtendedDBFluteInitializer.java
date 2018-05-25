package com.olympus.hora.common.dbflute;

import javax.sql.DataSource;

import com.olympus.hora.dbflute.allcommon.DBFluteInitializer;

public class ExtendedDBFluteInitializer extends DBFluteInitializer {
	public ExtendedDBFluteInitializer(DataSource dataSource) {
		super(dataSource);
	}

	@Override
	protected boolean needsSpringTransactionalDataSource(String dataSourceFqcn) {
		return true;
	}
}