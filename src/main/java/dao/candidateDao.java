package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.candidateBean;
import util.dbconnection;

public class candidateDao 
{
	public void insert_1st_cand(candidateBean candBean)
	{
		Connection conn = dbconnection.getDbConnection();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into 1st_cand (name, email, mobile, branch, rollno, enrillid, approve_status) values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, candBean.getName());
			pstmt.setString(2, candBean.getEmail());
			pstmt.setFloat(3, candBean.getMobile());
			pstmt.setString(4, candBean.getBranch());
			pstmt.setInt(5, candBean.getRollno());
			pstmt.setString(6, candBean.getEnrollment());
			pstmt.setInt(7, 0);
			pstmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insert_2nd_cand(candidateBean candBean)
	{
		Connection conn = dbconnection.getDbConnection();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into 2nd_cand (name, email, mobile, branch, rollno, enrillid, approve_status) values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, candBean.getName());
			pstmt.setString(2, candBean.getEmail());
			pstmt.setFloat(3, candBean.getMobile());
			pstmt.setString(4, candBean.getBranch());
			pstmt.setInt(5, candBean.getRollno());
			pstmt.setString(6, candBean.getEnrollment());
			pstmt.setInt(7, 0);
			pstmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert_3rd_cand(candidateBean candBean)
	{
		Connection conn = dbconnection.getDbConnection();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("insert into 3rd_cand (name, email, mobile, branch, rollno, enrillid, approve_status) values(?,?,?,?,?,?,?)");
			
			pstmt.setString(1, candBean.getName());
			pstmt.setString(2, candBean.getEmail());
			pstmt.setFloat(3, candBean.getMobile());
			pstmt.setString(4, candBean.getBranch());
			pstmt.setInt(5, candBean.getRollno());
			pstmt.setString(6, candBean.getEnrollment());
			pstmt.setInt(7, 0);
			pstmt.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<candidateBean> get_1st_cand()
	{
		Connection conn = dbconnection.getDbConnection();
		
		ArrayList<candidateBean> cand_1st = new ArrayList();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select * from 1st_cand where approve_status=1");	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				candidateBean candBean = new candidateBean();
				
				candBean.setId(rs.getInt("id"));
				candBean.setName(rs.getString("name"));
				candBean.setEmail(rs.getString("email"));
				candBean.setMobile(rs.getLong("mobile"));
				candBean.setBranch(rs.getString("branch"));
				candBean.setRollno(rs.getInt("rollno"));
				candBean.setEnrollment(rs.getString("enrillid"));
				candBean.setApproveStatus(rs.getInt("approve_status"));
				
				cand_1st.add(candBean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cand_1st;
	}
	
	public ArrayList<candidateBean> get_1st_cand_admin()
	{
		Connection conn = dbconnection.getDbConnection();
		
		ArrayList<candidateBean> cand_1st = new ArrayList();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select * from 1st_cand");	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				candidateBean candBean = new candidateBean();
				
				candBean.setId(rs.getInt("id"));
				candBean.setName(rs.getString("name"));
				candBean.setEmail(rs.getString("email"));
				candBean.setMobile(rs.getLong("mobile"));
				candBean.setBranch(rs.getString("branch"));
				candBean.setRollno(rs.getInt("rollno"));
				candBean.setEnrollment(rs.getString("enrillid"));
				candBean.setApproveStatus(rs.getInt("approve_status"));
				
				cand_1st.add(candBean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cand_1st;
	}
	
	public ArrayList<candidateBean> get_2nd_cand()
	{
		Connection conn = dbconnection.getDbConnection();
		
		ArrayList<candidateBean> cand_2nd = new ArrayList();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select * from 2nd_cand where approve_status=1");	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				candidateBean candBean = new candidateBean();
				
				candBean.setId(rs.getInt("id"));
				candBean.setName(rs.getString("name"));
				candBean.setEmail(rs.getString("email"));
				candBean.setMobile(rs.getLong("mobile"));
				candBean.setBranch(rs.getString("branch"));
				candBean.setRollno(rs.getInt("rollno"));
				candBean.setEnrollment(rs.getString("enrillid"));
				candBean.setApproveStatus(rs.getInt("approve_status"));
				
				cand_2nd.add(candBean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cand_2nd;
	}
	
	public ArrayList<candidateBean> get_2nd_cand_admin()
	{
		Connection conn = dbconnection.getDbConnection();
		
		ArrayList<candidateBean> cand_2nd = new ArrayList();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select * from 2nd_cand");	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				candidateBean candBean = new candidateBean();
				
				candBean.setId(rs.getInt("id"));
				candBean.setName(rs.getString("name"));
				candBean.setEmail(rs.getString("email"));
				candBean.setMobile(rs.getLong("mobile"));
				candBean.setBranch(rs.getString("branch"));
				candBean.setRollno(rs.getInt("rollno"));
				candBean.setEnrollment(rs.getString("enrillid"));
				candBean.setApproveStatus(rs.getInt("approve_status"));
				
				cand_2nd.add(candBean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cand_2nd;
	}
	
	public ArrayList<candidateBean> get_3rd_cand()
	{
		Connection conn = dbconnection.getDbConnection();
		
		ArrayList<candidateBean> cand_3rd = new ArrayList();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select * from 3rd_cand where approve_status=1");	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				candidateBean candBean = new candidateBean();
				
				candBean.setId(rs.getInt("id"));
				candBean.setName(rs.getString("name"));
				candBean.setEmail(rs.getString("email"));
				candBean.setMobile(rs.getLong("mobile"));
				candBean.setBranch(rs.getString("branch"));
				candBean.setRollno(rs.getInt("rollno"));
				candBean.setEnrollment(rs.getString("enrillid"));
				candBean.setApproveStatus(rs.getInt("approve_status"));
				
			
				cand_3rd.add(candBean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cand_3rd;
	}
	
	public ArrayList<candidateBean> get_3rd_cand_admin()
	{
		Connection conn = dbconnection.getDbConnection();
		
		ArrayList<candidateBean> cand_3rd = new ArrayList();
		try {
			
			PreparedStatement pstmt = conn.prepareStatement("select * from 3rd_cand");	
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				candidateBean candBean = new candidateBean();
				
				candBean.setId(rs.getInt("id"));
				candBean.setName(rs.getString("name"));
				candBean.setEmail(rs.getString("email"));
				candBean.setMobile(rs.getLong("mobile"));
				candBean.setBranch(rs.getString("branch"));
				candBean.setRollno(rs.getInt("rollno"));
				candBean.setEnrollment(rs.getString("enrillid"));
				candBean.setApproveStatus(rs.getInt("approve_status"));
				
			
				cand_3rd.add(candBean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cand_3rd;
	}
	
}
