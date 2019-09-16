package mvc;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddController")
public class AddController extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int code=Integer.parseInt(request.getParameter("bookId"));
		String title=request.getParameter("bookName");
		String author=request.getParameter("bookAuthor");
		String subject=request.getParameter("bookGenre");
		int price=Integer.parseInt(request.getParameter("bookPrice"));
		
		Book b=new Book(code,title,author,subject,price);
		BookDAO dao=new BookDAO();
		dao.saveBook(b);
	
		HttpSession session=request.getSession();
		session.setAttribute("BookDetails",b);
		response.sendRedirect("AddBooks.jsp");
		
	}

	}


