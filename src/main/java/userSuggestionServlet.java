

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.suggestionBean;
import dao.suggestiondao;

/**
 * Servlet implementation class userSuggestionServlet
 */
@WebServlet("/userSuggestionServlet")
public class userSuggestionServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		ArrayList<suggestionBean> list = new ArrayList<>();
		
		suggestiondao sDao = new suggestiondao();
		
		try {
			list = sDao.getsuggestion();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("user_suggestion.jsp");
			rd.forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
