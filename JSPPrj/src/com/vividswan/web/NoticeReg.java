package com.vividswan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg") // 어노테이션으로 URL 맵핑
public class NoticeReg extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request => 입력도구, response => 출력도구
		response.setCharacterEncoding("UTF-8"); // UTF-8로 보냄
		response.setContentType("text/html; charset=UTF-8"); // 웹사이트가 html, UTF-8 로 해석(응답 헤더)
		//request.setCharacterEncoding("UTF-8"); // 입력값도 UTF-8 도 처리
		
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		out.println(title);
		out.println(content);
	}
	
	
}