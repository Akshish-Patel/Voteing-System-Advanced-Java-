

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.voteUserBean;
import dao.voteUserDao;

/**
 * Servlet implementation class SavedData_2_servlet
 */
@WebServlet("/SavedData_2_servlet")
public class SavedData_2_servlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("txtName");
		String email= request.getParameter("txtEmail");
		String branch = request.getParameter("txtBranch");
		String number = request.getParameter("txtNumber");
		String cand = request.getParameter("txtCand");
		String rollno = request.getParameter("txtRollNo");
		String reason = request.getParameter("txtReason");
		
		voteUserBean userBean = new voteUserBean();
		
		userBean.setName(name);
		userBean.setEmail(email);
		userBean.setBranch(branch);
		userBean.setMob(number);
		userBean.setCandidate(cand);
		userBean.setRollno(rollno);
		userBean.setReason(reason);
		
		voteUserDao userDao = new voteUserDao();
		
		userDao.insert_2nd_user(userBean);
		
		response.sendRedirect("succesfull.jsp");
	}


}
