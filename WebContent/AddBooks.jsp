


<%@page import="mvc.Book"%>

<%
	Book b1=(Book)session.getAttribute("BookDetails");	//katti
	
	%>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<form action="AddController" method="get">
<h1><b>Add New Books</b></h1>
<hr>
<table  cellspacing="15px" >
<tr>
<td>Enter Book Code</td>
<td><input type="text" name="bookId"></td>
</tr>

<tr>
<td>Enter book name </td>
<td><input type="text" name="bookName"></td>
</tr>
<tr>
<td>Enter book Author name</td>
<td><input type="text"  name="bookAuthor"></td>
</tr>
<tr>
<td>Enter book Genre</td>
<td><input type="text" name="bookGenre"></td>
</tr>
<tr>
<td>Enter book Price</td>
<td><input type="text" name="bookPrice"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Add Book" ></td>
</tr>
</table>
<hr>
</form>

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