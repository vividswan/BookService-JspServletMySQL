package com.vividswan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg") // ������̼����� URL ����
public class NoticeReg extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request => �Էµ���, response => ��µ���
		response.setCharacterEncoding("UTF-8"); // UTF-8�� ����
		response.setContentType("text/html; charset=UTF-8"); // ������Ʈ�� html, UTF-8 �� �ؼ�(���� ���)
		//request.setCharacterEncoding("UTF-8"); // �Է°��� UTF-8 �� ó��
		
		PrintWriter out = response.getWriter();
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		out.println(title);
		out.println(content);
	}
	
	
}