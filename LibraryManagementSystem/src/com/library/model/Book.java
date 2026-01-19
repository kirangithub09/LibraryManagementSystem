package com.library.model;

public class Book {
	private int id;
	private String title;
	private boolean isIssued;
	
	public Book (int id, String title)
	{
		this.id=id;
		this.title=title;
		this.isIssued=false;
	}
	
	//Getters and Setters method
	public int getId()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public boolean isIssued()
	{
		return isIssued;
	}
	
	public void setIssued(boolean issued) {
		isIssued=issued;
	}
	
	@Override
	public String toString()
	{
		return "ID: "+id+" | Title: "+title+" | Status: "+ (isIssued ? "Issued" : "Available");
	}
	
	
	

}
