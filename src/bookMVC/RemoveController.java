package mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RemoveController")
public class RemoveController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id =Integer.parseInt(request.getParameter("bookId"));
		Book b = new BookDAO().searchBook(id);

		new BookDAO().removeBook(id);
		
		
		HttpSession session=request.getSession();
		session.setAttribute("BookDetails",b);
		response.sendRedirect("RemoveBook.jsp");
		
	}
 

	}


