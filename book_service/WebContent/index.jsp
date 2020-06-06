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
	height: 40px;
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
		<h1 align="center"><%=nowTitle%></h1>
	</div>
	<div id="nav">
		<ul>
			<li>목록</li>
			<li>대여량 기준 정렬</li>
			<li>대여된 책</li>
			<li>대여 가능한 책</li>
			<li>대여</li>
			<li>반납</li>
			<li>추가</li>
		</ul>
	</div>
	<div id="content">
	<br/>
	<jsp:include page="<%=nowPage%>" />
	</div>


</body>
</html>