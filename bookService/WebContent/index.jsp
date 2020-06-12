<%
request.setAttribute("indexFlag", "firstPage");
RequestDispatcher dispatcher = request.getRequestDispatcher("/bookList.action");
dispatcher.forward(request, response);
%>