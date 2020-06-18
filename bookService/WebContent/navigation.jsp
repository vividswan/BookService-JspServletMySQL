<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Navigation Page</title>
</head>
<body>
	<div id="nav">
		<ul>
			<li><a href="bookList.action">목록</a></li>
			<li><a href="pageUtil.jsp?path=sortPage">대여량 기준 정렬</a></li>
			<li><a href="pageUtil.jsp?path=borrowedBookPage">대여된 책</a></li>
			<li><a href="pageUtil.jsp?path=notBorrowedBookPage">대여 가능한 책</a></li>
			<li><a href="bookBorrow.jsp">대여</a></li>
			<li><a href="pageUtil.jsp?path=bookReturn">반납</a></li>
			<li><a href="bookInsert.jsp">추가</a></li>
			<li><a href="bookSearch.jsp">ID 검색</a></li>
			<li><a href="pageUtil.jsp?path=bookDelete">삭제</a></li>
		</ul>
	</div>
</body>
</html>