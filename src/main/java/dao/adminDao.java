package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.adminBean;
import util.dbconnection;

public class adminDao 
{
	public Boolean getadmin(adminBean aBean) throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from admin where username = ? and password = ?");
		
		pstmt.setString(1, aBean.getUsername());
		pstmt.setString(2, aBean.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		
//		System.out.println(rs.get);
		
		if(rs.next())
		{
			return true;
		}else {
			return false;
		}
	}
}
