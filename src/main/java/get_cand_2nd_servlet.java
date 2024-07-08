

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
 * Servlet implementation class get_cand_2nd_servlet
 */
@WebServlet("/get_cand_2nd_servlet")
public class get_cand_2nd_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		candidateDao candDao = new candidateDao();
		ArrayList<candidateBean> cand_2nd = candDao.get_2nd_cand();
		
		request.setAttribute("cand_2nd", cand_2nd);
		RequestDispatcher rd = request.getRequestDispatcher("2nd_cand.jsp");
		rd.forward(request, response);
	}



}
