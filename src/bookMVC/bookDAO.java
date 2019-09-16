package bookMVC;

import java.sql.*;
import java.util.List;

public class bookDAO {
private Connection con;


public static void Main(String ar[])
{
	bookDAO dao = new bookDAO();
	//Book book = dao.searchbook(2);
	Book booksave = new Book(1,"ii","ss","kk",565);
	dao.savebook(booksave);
	//System.out.print(book);
}


public Book searchBook(String code) {
	Book book = null;
	String sql = "SELECT * FROM books WHERE id=?";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, code);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			book = new Book();
			book.setId(rs.getInt(1));
			book.setName(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setSubject(rs.getString(4));
			book.setPrice(rs.getInt(5));
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	return book;
}



public void deleteBook(String code){
	try{
		String sql = "delete from books where id=?";
		PreparedStatement st =con.prepareStatement(sql);
		st.setString(1,code);
		st.executeUpdate();
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
	                   
	
}


public void savebook(Book book)
	{
		String sql = "insert into books values(?,?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, book.getId());
			ps.setString(2,book.getName());
			ps.setString(3,book.getAuthor());
			ps.setString(4,book.getSubject());
			ps.setInt(5, book.getPrice());
			ps.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
		
	public Book searchBook(int code)
	{
		String sql = "select * from books where id =?";
		PreparedStatement ps;
		Book book=null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();
			while (rs.next())
			{
				book = new Book();
				book.setId(rs.getInt(1));
				book.setName(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setSubject(rs.getString(4));
				book.setPrice(rs.getInt(5));
			}
			
			return book;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	public List<Book> getAllBooks()
	{
		return null;
	}
	
	
public bookDAO()
	{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/booksdata", "root", "root");
		}
		catch(Exception e)
		{
			
		}
	}
	
}
