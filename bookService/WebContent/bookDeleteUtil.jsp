<%
String ID = request.getParameter("ID");
request.setAttribute("ID", ID);
RequestDispatcher dispatcher = request.getRequestDispatcher("/bookDelete.action");
dispatcher.forward(request, response);
%>