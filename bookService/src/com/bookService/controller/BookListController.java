package com.bookService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookService.service.BookService;
import com.bookService.vo.BookVO;

public class BookListController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strUpperSeqNo = request.getParameter("LAST_SEQ_NO");
		int upperSeqNo = 0;
		if (strUpperSeqNo == null)
			upperSeqNo = 0;
		else
			upperSeqNo = Integer.parseInt(strUpperSeqNo);
		
		String indexFlag = (String)request.getAttribute("indexFlag");
		
		BookService service = BookService.getInstance();
		if(indexFlag != null &&indexFlag.equals("sortPage")) {
			ArrayList<BookVO> list = service.bookListByBorrowCnt(upperSeqNo);
			request.setAttribute("list", list);
		}else if (indexFlag != null &&indexFlag.equals("notBorrowedBookPage")) {
			ArrayList<BookVO> list = service.bookListNotBorrowed(upperSeqNo);
			request.setAttribute("list", list);
		}else if (indexFlag != null &&indexFlag.equals("borrowedBookPage")) {
			ArrayList<BookVO> list = service.bookListBorrowed(upperSeqNo);
			request.setAttribute("list", list);
		}else if (indexFlag != null &&indexFlag.equals("bookReturn")) {
			ArrayList<BookVO> list = service.bookListBorrowed(upperSeqNo);
			request.setAttribute("list", list);
		}else {
		ArrayList<BookVO> list = service.bookList(upperSeqNo);
		request.setAttribute("list", list);
		}
		
		if(indexFlag != null &&indexFlag.equals("firstPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputFirst.jsp");
		}else if(indexFlag != null &&indexFlag.equals("sortPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputSort.jsp");
		}else if(indexFlag != null &&indexFlag.equals("borrowedBookPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputBorrow.jsp");
		}else if(indexFlag != null &&indexFlag.equals("notBorrowedBookPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputNotBorrow.jsp");
		}else if(indexFlag != null &&indexFlag.equals("bookReturn")) {
			HttpUtil.forward(request, response, "/result/bookReturnListOutput.jsp");
		}else if(indexFlag != null && indexFlag.equals("bookDeletePage")) {
			HttpUtil.forward(request, response, "/result/bookDeleteListOutput.jsp");
		}else HttpUtil.forward(request, response, "/result/bookListOutput.jsp?upperSeqNo="+upperSeqNo);
	}
	
}