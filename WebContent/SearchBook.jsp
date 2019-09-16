
<%@page import="mvc.Book"%>

<%
	Book b1=(Book)session.getAttribute("BookDetails");	
	
	%>  
<html>
<body>
	<h3>Book-Search-Form</h3>
	<hr>
		<form action="SearchController">
			Code <input type="text" name="bookId"/>
			<input type="submit" value="Search"/>
		</form>
	<hr>
	
	
		
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
	<a href="index.jsp">Home</a>
</body>
</html>