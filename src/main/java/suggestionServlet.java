

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.suggestionBean;
import dao.suggestiondao;

/**
 * Servlet implementation class suggestionServlet
 */
@WebServlet("/suggestionServlet")
public class suggestionServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String number = request.getParameter("txtNumber");
		Integer rollno = Integer.parseInt(request.getParameter("txtRollNo"));
		String suggestion = request.getParameter("txtSuggestion");
		
		suggestionBean sBean = new suggestionBean();
		
		sBean.setName(name);
		sBean.setEmail(email);
		sBean.setNumber(number);
		sBean.setRollno(rollno);
		sBean.setSuggestion(suggestion);
		
		suggestiondao sDao = new suggestiondao();
		
		try {
			sDao.insertSuggestion(sBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("succesfull.jsp");
	}
}
