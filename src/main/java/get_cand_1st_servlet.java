

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
 * Servlet implementation class get_cand_1st_servlet
 */
@WebServlet("/get_cand_1st_servlet")
public class get_cand_1st_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		candidateDao candDao = new candidateDao();
		ArrayList<candidateBean> cand_1st = candDao.get_1st_cand();
		
		request.setAttribute("cand_1st", cand_1st);
		RequestDispatcher rd = request.getRequestDispatcher("1st_cand.jsp");
		rd.forward(request, response);
	}


}
