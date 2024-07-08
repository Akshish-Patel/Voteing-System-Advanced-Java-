

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.candidateBean;
import dao.candidateDao;

/**
 * Servlet implementation class insert_cand_1st_servlet
 */
@WebServlet("/insert_cand_1st_servlet")
public class insert_cand_1st_servlet extends HttpServlet 
{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String number = request.getParameter("txtNumber");
		String branch = request.getParameter("txtbranch");
		String rollno = request.getParameter("txtRollNo");
		String enrollment = request.getParameter("txtEnrollID");

		candidateBean candBean = new candidateBean();
		
		candBean.setName(name);
		candBean.setEmail(email);
		candBean.setMobile(Long.parseLong(number));
		candBean.setBranch(branch);
		candBean.setRollno(Integer.parseInt(rollno));
		candBean.setEnrollment(enrollment);
		
		candidateDao candDao = new candidateDao();
		
		candDao.insert_1st_cand(candBean);
		
		response.sendRedirect("pending.jsp");
	}

}
