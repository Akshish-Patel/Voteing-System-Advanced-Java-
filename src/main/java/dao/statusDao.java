package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.dbconnection;

public class statusDao 
{
	public void changeStatus_1(int id, String status) throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("update 1st_cand set approve_status=? where id=?");
		
		pstmt.setString(1, status);
		pstmt.setInt(2, id);
		pstmt.execute();
	}

	
	public void changeStatus_2(int id, String status) throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("update 2nd_cand set approve_status=? where id=?");
		
		pstmt.setString(1, status);
		pstmt.setInt(2, id);
		pstmt.execute();
	}
	
	public void changeStatus_3(int id, String status) throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("update 3rd_cand set approve_status=? where id=?");
		
		pstmt.setString(1, status);
		pstmt.setInt(2, id);
		pstmt.execute();
	}
}
