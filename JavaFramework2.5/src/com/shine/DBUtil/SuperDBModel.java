package com.shine.DBUtil;

import com.shine.DBUtil.model.DBModel;

/**
 * 
 * 带数据库操作的dbmodel
 * 
 * @author viruscodecn@gmail.com
 * 
 */
public final class SuperDBModel extends DBModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String jndi;
	private String tableName;

	public void select(String sql) {
	}

	public int insert(String sql) {
		return 0;
	}

	public int update(String sql) {
		return 0;
	}

	public String getJndi() {
		return jndi;
	}

	public void setJndi(String jndi) {
		this.jndi = jndi;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}