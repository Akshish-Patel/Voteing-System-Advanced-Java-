

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.candidateBean;
import dao.candidateDao;

/**
 * Servlet implementation class user_cand_3_servlet
 */
@WebServlet("/user_cand_3_servlet")
public class user_cand_3_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		candidateDao candDao = new candidateDao();
		
		ArrayList<candidateBean> list = candDao.get_3rd_cand_admin();
		
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("user_cand_3.jsp");
		rd.forward(request, response);
	}


}
