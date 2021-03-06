package com.hzone.db.conn.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.hzone.db.conn.annotation.Resource;

public class GameConnectionDAO extends BaseDAO {

	@Resource(value = ResourceType.DB_game)
	public Database database;
	
	/**
	 * Method getConnection.
	 * @return Connection
	 * @throws SQLException 
	 */
	protected Connection getRealConnection(){
		return database.getConnection();
	}

}
