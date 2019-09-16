


<%@page import="mvc.Book"%>

<%
	Book b1=(Book)session.getAttribute("BookDetails");	
	
	%>
<html>
<body>
	<h3>Remove-Book-Form</h3>
	<hr>
		<form action="RemoveController">
			Enter Id to remove  <input type="text" name = "bookId" />
			<input type="submit" value="Remove"/>
		</form>
	<hr>
	<a href="">Home</a>
	
	
<% if(b1!=null) {%>
	<h3>Book Details</h3>
	<hr>
	
	<Pre>
	Book Id    :    <%=b1.getBookId()%> 
	Book Name    :    <%=b1.getBookName()%>
	Book Author    :    <%=b1.getAuthorName()%>
	Book Price   :     <%=b1.getPrice()%>
	Book Subject  :   <%=b1.getSubject()%>
	
	</Pre>
	
	<%} %>
	
	<hr>
	
</body>
</html>