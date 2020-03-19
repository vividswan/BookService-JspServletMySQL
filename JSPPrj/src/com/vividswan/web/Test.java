package com.vividswan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") // 어노테이션으로 URL 맵핑
public class Test extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request => 입력도구, response => 출력도구
		response.setCharacterEncoding("UTF-8"); // UTF-8로 보냄
		response.setContentType("text/html; charset=UTF-8"); // 웹사이트가 html, UTF-8 로 해석(응답 헤더)
		
		PrintWriter out = response.getWriter();
		
		String cnt_ = request.getParameter("cnt");
		
		int cnt = 100;
		
		if(cnt_ != null && !cnt_.equals("")) cnt = Integer.parseInt(cnt_);
		// 쿼리값(입력값)을 받아서 문자열로 전송되서 정수형식으로 문자열 반환
		
		for(int i=0;i<cnt;i++) {
			out.print("안녕  Servlet <br />");
		}
		
	}
	
	
}