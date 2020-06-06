<%@page import="com.bookservice.vo.BookVO"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<title>Book List</title>
</head>
<body>
<%
ArrayList<BookVO> list = (ArrayList<BookVO>) request.getAttribute("list");
if(!list.isEmpty()){ %>
	<table border="1">
	<tr><th>ID</th><th>이름</th><th>저자</th>가격<th>대여 가능</th><th>대여 횟수</th></tr>
	<% for(int i=0; i<list.size();i++){
		BookVO book = list.get(i); %>
		<tr>
			<td><%=book.getID() %></td>
			<td><%=book.getName() %></td>
			<td><%=book.getAuthor() %></td>
			<td><%=book.getPrice() %></td>
			<td><% if(book.isBorrow()) out.print("N"); else out.print("Y"); %></td>
			<td><%=book.getBorrowCnt() %></td>
		</tr>
	<%}
}
	else {
		out.print("<h3>등록된 회원정보가 없습니다.</h3>");
	}
 %>
 </table>
</body>
</html>