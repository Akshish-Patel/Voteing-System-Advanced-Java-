package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.contactBean;
import util.dbconnection;

public class contactDao 
{
	
	public void insert_contact(contactBean cBean)
	{
		Connection conn = dbconnection.getDbConnection();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into contact (name, email, message) values(?,?,?)");
			
			pstmt.setString(1, cBean.getName());
			pstmt.setString(2, cBean.getEmail());
			pstmt.setString(3, cBean.getMeddage());
			
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public ArrayList<contactBean> get_contact() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from contact");
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<contactBean> list = new ArrayList<>();
		while(rs.next())
		{
			contactBean cBean = new contactBean();
			
			cBean.setName(rs.getString("name"));
			cBean.setEmail(rs.getString("email"));
			cBean.setMeddage(rs.getString("message"));
			
			list.add(cBean);
		}
		
		return list;
	}
}
