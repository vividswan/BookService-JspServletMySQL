package com.vividswan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") // ������̼����� URL ����
public class Test extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request => �Էµ���, response => ��µ���
		response.setCharacterEncoding("UTF-8"); // UTF-8�� ����
		response.setContentType("text/html; charset=UTF-8"); // ������Ʈ�� html, UTF-8 �� �ؼ�(���� ���)
		
		PrintWriter out = response.getWriter();
		
		String cnt_ = request.getParameter("cnt");
		
		int cnt = 100;
		
		if(cnt_ != null && !cnt_.equals("")) cnt = Integer.parseInt(cnt_);
		// ������(�Է°�)�� �޾Ƽ� ���ڿ��� ���۵Ǽ� ������������ ���ڿ� ��ȯ
		
		for(int i=0;i<cnt;i++) {
			out.print("�ȳ�  Servlet <br />");
		}
		
	}
	
	
}