

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.contactBean;
import dao.contactDao;

/**
 * Servlet implementation class showcontactServlet
 */
@WebServlet("/showcontactServlet")
public class showcontactServlet extends HttpServlet 
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		contactDao cDao = new contactDao();
		
		try {
			
			ArrayList<contactBean> list = cDao.get_contact();
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("show_contact.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
