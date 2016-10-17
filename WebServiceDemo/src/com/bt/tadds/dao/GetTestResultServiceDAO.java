package com.bt.tadds.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OraclePreparedStatement;


public class GetTestResultServiceDAO {
	public String getTestResults(String testId,String tarrId){
		Connection connection=null;
		OraclePreparedStatement oraclePreparedStatement=null;
		ResultSet rs=null;
		try{
			connection.prepareCall("");
		}catch(SQLException e){
			
		}finally{
			//call close method f connection and preparedStatement object and resultset object
		}
		return null;
	}
	public String[] getTestResults(String serviceId){
		Connection connection=null;
		OraclePreparedStatement oraclePreparedStatement=null;
		ResultSet rs=null;
		try{
			connection.prepareCall(""); 
			//get connection object
			//get prepared statement
			//get the resultset object
		}catch(SQLException e){
			
		}finally{
			//call close method f connection and preparedStatement object and resultset object
		}
		return null;
		
	}
	

}
