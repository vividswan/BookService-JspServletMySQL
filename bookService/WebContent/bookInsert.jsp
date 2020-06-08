<%@ page contentType="text/html; charset=UTF-8"%>
<%
String nowTitle = "추가";
%>
<!DOCTYPE html>
<html>
<head>
<title>Book Insert</title>
<style>
table {
	width: 80%;
	border-collapse: collapse;
}

table td {
	border: 1px soild black;
	padding: 5px;
}

#heaer {
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
	height: 30px;
	float: right;
}


#content {
	width: 70%;
	height: 70px;
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
		<form action="memberInsert.action" method="post">
			<table border="1">
				<tbody>
					<tr>
						<td width="30%" align="center">ID</td>
						<td width="70%"><input type="text" name="ID" size="20"
							style="width: 100%; border: 0;"></td>
					</tr>
					<tr>
						<td width="30%" align="center">이름</td>
						<td width="70%" align="center"><input type="name" name="text"
							size="20" style="width: 100%; border: 0;"></td>
					</tr>
					<tr>
						<td width="30%" align="center">저자</td>
						<td width="70%" align="center"><input type="author"
							name="text" size="20" style="width: 100%; border: 0;"></td>
					</tr>
					<tr>
						<td width="30%" align="center">가격</td>
						<td width="70%" align="center"><input type="price"
							name="text" size="20" style="width: 100%; border: 0;"></td>
					</tr>
				</tbody>
			</table>
			<div align="center">
				<input type="submit" value="저장" />
			</div>
		</form>
	</div>
</body>
</html>