package com.study.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SecondServlet!!");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<title><head>Test</head></title>");
		out.println("<body><h1>Hello World!</h1></body>");
		out.println("</hmtl>");
		out.close();
	}

}
