<%
String str = (String)request.getParameter("path");
if(str.equals("sortPage")) request.setAttribute("indexFlag", "sortPage");
else if(str.equals("borrowedBookPage")) request.setAttribute("indexFlag", "borrowedBookPage");
else if(str.equals("notBorrowedBookPage")) request.setAttribute("indexFlag", "notBorrowedBookPage");
RequestDispatcher dispatcher = request.getRequestDispatcher("/bookList.action");
dispatcher.forward(request, response);
%>