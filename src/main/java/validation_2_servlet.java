

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.validationBean;
import dao.validationDao;

/**
 * Servlet implementation class validation_2_servlet
 */
@WebServlet("/validation_2_servlet")
public class validation_2_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		validationDao vDao = new validationDao();
		try {
			
			ArrayList<validationBean> list = vDao.user_2nd();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("validation_2.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
