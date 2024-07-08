

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
 * Servlet implementation class get_cand_3rd_servlet
 */
@WebServlet("/get_cand_3rd_servlet")
public class get_cand_3rd_servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		candidateDao candDao = new candidateDao();
		ArrayList<candidateBean> cand_3rd = candDao.get_3rd_cand();
		
		request.setAttribute("cand_3rd", cand_3rd);
		RequestDispatcher rd = request.getRequestDispatcher("3rd_cand.jsp");
		rd.forward(request, response);
	}



}
