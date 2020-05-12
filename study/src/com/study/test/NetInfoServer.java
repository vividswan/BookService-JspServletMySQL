package com.study.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlInfo")
public class NetInfoServer extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Request Information Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>Request Information Servlet</h3>");
		out.print("Request URI : "+request.getRequestURI()+"<br/>");
		out.print("Request URl : "+request.getRequestURL()+"<br/>");
		out.print("Context Path : "+request.getContextPath()+"<br/>");
		out.print("Request Protocol : "+request.getProtocol()+"<br/>");
		out.print("Servlet Path : "+request.getServletPath()+"<br/>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}
}
