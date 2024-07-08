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

@WebServlet("/confirmation_1")
public class confirmation_1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		candidateDao candDao = new candidateDao();
		ArrayList<candidateBean> list = candDao.get_1st_cand();
		
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("confirmation_1.jsp");
		rd.forward(request, response);
	}
}
