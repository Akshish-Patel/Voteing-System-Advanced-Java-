package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.suggestionBean;
import util.dbconnection;

public class suggestiondao 
{
	public void insertSuggestion(suggestionBean sBean) throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("insert into suggestion (name, email, number, rollno, suggestion) values(?,?,?,?,?)");
		
		pstmt.setString(1, sBean.getName());
		pstmt.setString(2, sBean.getEmail());
		pstmt.setString(3, sBean.getNumber());
		pstmt.setInt(4, sBean.getRollno());
		pstmt.setString(5, sBean.getSuggestion());
		
		pstmt.execute();
		
	}
	
	public ArrayList<suggestionBean> getsuggestion() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from suggestion");
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<suggestionBean> list = new ArrayList<>();
		suggestionBean sBean = null;
		
		while(rs.next())
		{
			sBean = new suggestionBean();
			
			sBean.setName(rs.getString("name"));
			sBean.setEmail(rs.getString("email"));
			sBean.setNumber(rs.getString("number"));
			sBean.setRollno(rs.getInt("rollno"));
			sBean.setSuggestion(rs.getString("suggestion"));
			
			list.add(sBean);
		}
		
		return list;
	}
}
