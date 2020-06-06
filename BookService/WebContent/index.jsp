<%@ page contentType="text/html; charset=UTF-8"%>
<% String nowPage = "index2.jsp";
String nowTitle = "홈";
%>
<!DOCTYPE html>
<html>
<head>
<title>Book Service System</title>
<style>
#heaer {
	width: 100%;
	height: 50px;
}

#nav {
widht:30%;
height:100px;
float:left;	
}
#content{
width:70%;
height: 100px;
float:right;
}
</style>
</head>
<body>
	<div id="header">
		<h1 align="center"><%=nowTitle %></h1>
	</div>
	<div id="nav">
		<ul>
			<li>목록</a></li>
			<li>대여량 기준 정렬</li>
		</ul>
	</div>
	<div id="content">
	<br/>
	<jsp:include page="<%=nowPage %>" />
	</div>


</body>
</html>