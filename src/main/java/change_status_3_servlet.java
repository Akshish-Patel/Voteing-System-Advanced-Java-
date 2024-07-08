

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.statusDao;

/**
 * Servlet implementation class change_status_3_servlet
 */
@WebServlet("/change_status_3_servlet")
public class change_status_3_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id").replaceAll("'", ""));
		String status = request.getParameter("status");
		
		System.out.println(id + status);
		
		statusDao s = new statusDao();
		
		response.sendRedirect("user_cand_3_servlet");
		
		try {
			s.changeStatus_3(id, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
