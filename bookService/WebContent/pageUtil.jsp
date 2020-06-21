<%
String str = (String)request.getParameter("path");
if(str.equals("sortPage")) request.setAttribute("indexFlag", "sortPage");
else if(str.equals("borrowedBookPage")) request.setAttribute("indexFlag", "borrowedBookPage");
else if(str.equals("notBorrowedBookPage")) request.setAttribute("indexFlag", "notBorrowedBookPage");
else if(str.equals("bookReturn")) request.setAttribute("indexFlag", "bookReturn");
else if(str.equals("bookDelete")) request.setAttribute("indexFlag", "bookDeletePage");
RequestDispatcher dispatcher = request.getRequestDispatcher("/bookList.action");
dispatcher.forward(request, response);
%>