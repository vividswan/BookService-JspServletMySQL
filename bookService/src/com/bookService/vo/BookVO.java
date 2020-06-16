package com.bookService.vo;

public class BookVO{
	private int ID;
	private String name;
	private String author;
	private int price;
	private boolean isBorrowed;
	private int borrowCnt;
	private boolean lastData = false;
	
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
	public boolean isLastData() {
		return lastData;
	}
	public void setLastData(boolean lastData) {
		this.lastData = lastData;
	}
}
