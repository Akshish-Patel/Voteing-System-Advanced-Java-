

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
 * Servlet implementation class validation_3_servlet
 */
@WebServlet("/validation_3_servlet")
public class validation_3_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		validationDao vDao = new validationDao();
		try {
			
			ArrayList<validationBean> list = vDao.user_3rd();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("validation_3.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
