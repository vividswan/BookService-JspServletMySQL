package com.bookService.controller;

import javax.servlet.*;
import javax.servlet.http.*;

public class HttpUtil {
	public static void forward(HttpServletRequest request, HttpServletResponse response, String path) {
		try {
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request,response);
			
		} catch (Exception e) {
			System.out.println("forwarding error : "+e);
		}
	}
}
