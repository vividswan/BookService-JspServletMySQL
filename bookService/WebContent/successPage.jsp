<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Success Page</title>
<style>
#header {
	width: 100%;
	height: 40px;
}

#nav {
widht:30%;
height:100px;
float:left;	
}

#emptySpace{
	width: 70%;
	height: 60px;
	float: right;
}


#content {
	width: 70%;
	height: 40px;
	float: right;
}
</style>
</head>
<body>
	<div id="header">
		<h1 align="center">${nowTitle}</h1>
	</div>
	<div id="nav">
	<jsp:include page="navigation.jsp" />
	</div>
		<div id="emptySpace"></div>
	<div id="content">
	${success}
	</div>

</body>
</html>