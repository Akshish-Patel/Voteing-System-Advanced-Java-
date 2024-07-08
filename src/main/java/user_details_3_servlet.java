

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.voteUserBean;
import dao.voteUserDao;

/**
 * Servlet implementation class user_details_3_servlet
 */
@WebServlet("/user_details_3_servlet")
public class user_details_3_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		voteUserDao vDao = new voteUserDao();
		
		try {
			
			ArrayList<voteUserBean> list = vDao.get_3rd_user();
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("user_details_3.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
