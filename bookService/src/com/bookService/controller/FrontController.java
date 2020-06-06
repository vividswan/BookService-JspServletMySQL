package com.bookService.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.naming.ContextAccessController;

import java.util.*;

public class FrontController extends HttpServlet {
	String charset = null;
	HashMap<String, Controller> list = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
		list = new HashMap<String, Controller>();
		list.put("/bookInsert.action",new BookInsertController());
		list.put("/bookSearch.action",new BookSearchController());
		list.put("/bookUpdate.action",new BookUpdateController());
		list.put("/bookDelete.action",new BookDeleteController());
		list.put("/bookList.action",new BookListController());	
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding(charset);
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = url.substring(contextPath.length());
		Controller subcontroller = list.get(path);
		subController.execute(request,response);
	}
}