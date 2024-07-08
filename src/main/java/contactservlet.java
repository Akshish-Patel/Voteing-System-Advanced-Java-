

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.contactBean;
import dao.contactDao;

/**
 * Servlet implementation class contactservlet
 */
@WebServlet("/contactservlet")
public class contactservlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String message = request.getParameter("txtMessage");
		
		contactBean cBean = new contactBean();
		
		cBean.setName(name);
		cBean.setEmail(email);
		cBean.setMeddage(message);
		
		contactDao cDao = new contactDao();
		
		cDao.insert_contact(cBean);
		
		response.sendRedirect("contact.jsp");
	}
	
}
