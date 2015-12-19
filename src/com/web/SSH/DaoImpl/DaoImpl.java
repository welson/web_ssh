package com.web.SSH.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.web.SSH.dao.Dao;

public class DaoImpl implements Dao{
	private String className = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb?useUnicode=true&characterEncoding=UTF8";
	private String root = "root";
	private String pswd = "xue612";
	

	@Override
	public Connection getConn() throws Exception {
		// TODO Auto-generated method stub
		Class.forName(className);
		Connection conn = DriverManager.getConnection(url,root,pswd);
		return conn;
	}
	
	
	public void closeConn(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		} 
	}
}
