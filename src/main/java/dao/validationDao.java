package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.validationBean;
import util.dbconnection;

public class validationDao 
{
	public ArrayList<validationBean> user_1st() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select candidate, count(*) as result from user_1st group by candidate");

		ResultSet rs = pstmt.executeQuery();
		ArrayList<validationBean> list = new ArrayList<>();
		
//		System.out.println(rs.next());
		while(rs.next())
		{
			validationBean vBean = new validationBean();
			
			vBean.setCandidate(rs.getString("candidate"));
			vBean.setResult(rs.getInt("result"));
			list.add(vBean);
		}
		
		return list;
	}
	
	public ArrayList<validationBean> user_2nd() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select candidate, count(*) as result from user_2nd group by candidate");

		ResultSet rs = pstmt.executeQuery();
		ArrayList<validationBean> list = new ArrayList<>();
		
//		System.out.println(rs.next());
		while(rs.next())
		{
			validationBean vBean = new validationBean();
			
			vBean.setCandidate(rs.getString("candidate"));
			vBean.setResult(rs.getInt("result"));
			list.add(vBean);
		}
		
		return list;
	}
	
	public ArrayList<validationBean> user_3rd() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select candidate, count(*) as result from user_3rd group by candidate");

		ResultSet rs = pstmt.executeQuery();
		ArrayList<validationBean> list = new ArrayList<>();
		
//		System.out.println(rs.next());
		while(rs.next())
		{
			validationBean vBean = new validationBean();
			
			vBean.setCandidate(rs.getString("candidate"));
			vBean.setResult(rs.getInt("result"));
			list.add(vBean);
		}
		
		return list;
	}
	
}
