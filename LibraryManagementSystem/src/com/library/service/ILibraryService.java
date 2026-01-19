package com.library.service;
import com.library.model.Book;

public interface ILibraryService 
{
	//Services provided by library
	void addBook(Book book);
	
	void issueBook(int bookId);
	
	void returnBook(int bookId);
	
	void displayAllBooks();
}
