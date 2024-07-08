

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.adminBean;
import bean.validationBean;
import dao.adminDao;
import dao.validationDao;

/**
 * Servlet implementation class processServlet
 */
@WebServlet("/processServlet")
public class processServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		adminBean aBean = new adminBean();
		
		aBean.setUsername(username);
		aBean.setPassword(password);
		
		adminDao aDao  = new adminDao();
		
		validationDao vDao = new validationDao();
		
		try {
			Boolean validate = aDao.getadmin(aBean);
			
			if(validate)
			{
				
				ArrayList<validationBean> list = vDao.user_1st();
				
				request.setAttribute("list", list);
				
				RequestDispatcher rd = request.getRequestDispatcher("admin_dashboard.jsp");
				rd.forward(request, response);
				
//				response.sendRedirect("admin_dashboard.jsp");
			}else {
				request.setAttribute("error", "Invalid Credentials");
				RequestDispatcher rd = request.getRequestDispatcher("adminlogin.jsp");
				rd.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
