<%
String ID = request.getParameter("ID");
request.setAttribute("ID", ID);
RequestDispatcher dispatcher = request.getRequestDispatcher("/bookReturn.action");
dispatcher.forward(request, response);
%>