<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String nowTitle = "ID 검색";
%>
<!DOCTYPE html>
<html>
<head>
<title>Book Search System</title>
<style>
#header {
	width: 100%;
	height: 40px;
}

#nav {
	widht: 30%;
	height: 100px;
	float: left;
}
#emptySpace{
	width: 70%;
	height: 70px;
	float: right;
}

#content {
	width: 70%;
	height: 30px;
	float: right;
}
</style>
</head>
<body>
	<div id="header">
		<h1 align="center"><%=nowTitle%></h1>
	</div>
	<div id="nav">
		<jsp:include page="navigation.jsp" />
	</div>
	<div id="emptySpace"></div>
	<div id="content">
		<form action="bookSearch.action" method="post">
		찾고싶은 책의 ID를 입력하세요 : <input type="text" name="ID" />
			<input type="submit" value=" 확인" />
		</form>
	</div>

</body>
</html>