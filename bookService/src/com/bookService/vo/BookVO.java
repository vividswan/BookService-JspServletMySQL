package com.bookService.vo;

public class BookVO implements Comparable<BookVO>{
	private int ID;
	private String name;
	private String author;
	private int price;
	private boolean isBorrowed;
	private int borrowCnt;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isBorrowed() {
		return isBorrowed;
	}
	public void setIsBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}
	public int getBorrowCnt() {
		return borrowCnt;
	}
	public void setBorrowCnt(int borrowCnt) {
		this.borrowCnt = borrowCnt;
	}
	@Override
	public int compareTo(BookVO b) {
		if(this.borrowCnt < b.borrowCnt) return 1;
		else if (this.borrowCnt > b.borrowCnt) return -1;
		else return 0;
	}	
}
