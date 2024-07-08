
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.voteUserBean;
import util.dbconnection;

public class voteUserDao 
{
	public void insert_1st_user(voteUserBean userBean)
	{
		Connection conn = dbconnection.getDbConnection();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into user_1st (name, email, branch, number, candidate, rollno, reeason) values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, userBean.getName());
			pstmt.setString(2, userBean.getEmail());
			pstmt.setString(3, userBean.getBranch());
			pstmt.setString(4, userBean.getMob());
			pstmt.setString(5, userBean.getCandidate());
			pstmt.setInt(6, Integer.parseInt(userBean.getRollno()));
			pstmt.setString(7, userBean.getReason());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert_2nd_user(voteUserBean userBean)
	{
		Connection conn = dbconnection.getDbConnection();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into user_2nd (name, email, branch, number, candidate, rollno, reeason) values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, userBean.getName());
			pstmt.setString(2, userBean.getEmail());
			pstmt.setString(3, userBean.getBranch());
			pstmt.setString(4, userBean.getMob());
			pstmt.setString(5, userBean.getCandidate());
			pstmt.setInt(6, Integer.parseInt(userBean.getRollno()));
			pstmt.setString(7, userBean.getReason());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void insert_3rd_user(voteUserBean userBean)
	{
		Connection conn = dbconnection.getDbConnection();
		
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into user_3rd (name, email, branch, number, candidate, rollno, reeason) values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, userBean.getName());
			pstmt.setString(2, userBean.getEmail());
			pstmt.setString(3, userBean.getBranch());
			pstmt.setString(4, userBean.getMob());
			pstmt.setString(5, userBean.getCandidate());
			pstmt.setInt(6, Integer.parseInt(userBean.getRollno()));
			pstmt.setString(7, userBean.getReason());
			
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public ArrayList<voteUserBean> get_1st_user() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from user_1st order by id desc");
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<voteUserBean> list = new ArrayList<>();
		while(rs.next())
		{
			voteUserBean vBean = new voteUserBean();
			
			vBean.setName(rs.getString("name"));
			vBean.setEmail(rs.getString("email"));
			vBean.setBranch(rs.getString("branch"));
			vBean.setMob(rs.getString("number"));
			vBean.setCandidate(rs.getString("candidate"));
			vBean.setRollno(rs.getString("rollno"));
			vBean.setReason(rs.getString("reeason"));
			
			list.add(vBean);
		}
		return list;
	}
	
	public ArrayList<voteUserBean> get_2nd_user() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from user_2nd order by id desc");
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<voteUserBean> list = new ArrayList<>();
		while(rs.next())
		{
			voteUserBean vBean = new voteUserBean();
			
			vBean.setName(rs.getString("name"));
			vBean.setEmail(rs.getString("email"));
			vBean.setBranch(rs.getString("branch"));
			vBean.setMob(rs.getString("number"));
			vBean.setCandidate(rs.getString("candidate"));
			vBean.setRollno(rs.getString("rollno"));
			vBean.setReason(rs.getString("reeason"));
			
			list.add(vBean);
		}
		return list;
	}
	
	public ArrayList<voteUserBean> get_3rd_user() throws SQLException
	{
		Connection conn = dbconnection.getDbConnection();
		
		PreparedStatement pstmt = conn.prepareStatement("select * from user_3rd order by id desc");
		
		ResultSet rs = pstmt.executeQuery();
		ArrayList<voteUserBean> list = new ArrayList<>();
		while(rs.next())
		{
			voteUserBean vBean = new voteUserBean();
			
			vBean.setName(rs.getString("name"));
			vBean.setEmail(rs.getString("email"));
			vBean.setBranch(rs.getString("branch"));
			vBean.setMob(rs.getString("number"));
			vBean.setCandidate(rs.getString("candidate"));
			vBean.setRollno(rs.getString("rollno"));
			vBean.setReason(rs.getString("reeason"));
			
			list.add(vBean);
		}
		return list;
	}
}
