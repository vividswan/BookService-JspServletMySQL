package com.bookService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookService.service.BookService;
import com.bookService.vo.BookVO;

public class BookSearchController implements Controller {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _ID = request.getParameter("ID");
		if (_ID.isEmpty()) {
			request.setAttribute("nowTitle", "ID �˻�");
			request.setAttribute("error", "ID�� �Է��Ͻÿ�.");
			HttpUtil.forward(request, response, "/errorPage.jsp");
			return;
		}
		
		int ID=Integer.parseInt(_ID);

		BookService service = BookService.getInstance();
		BookVO book = service.bookSearch(ID);
		if(book == null) {
			request.setAttribute("nowTitle", "ID �˻�");
			request.setAttribute("error", "��ġ�ϴ� å�� �����ϴ�.");
			HttpUtil.forward(request, response, "/errorPage.jsp");
			return;
		}
		request.setAttribute("book", book);
		HttpUtil.forward(request, response, "/result/bookSearchOutput.jsp");
		return;

	}

}
