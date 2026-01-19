// File: com.library.service.LibraryServiceImpl.java
package com.library.service;
import com.library.model.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements ILibraryService {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    @Override
    public void displayAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    @Override
    public void issueBook(int bookId) {
        // Here is where you use Exception Handling or Logic to check if book exists
        for (Book b : books) {
            if (b.getId() == bookId && !b.isIssued()) {
                b.setIssued(true);
                System.out.println("Book issued!");
                return;
            }
        }
        System.out.println("Book not found or already issued.");
    }

    @Override
    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.getId() == bookId && b.isIssued()) {
                b.setIssued(false);
                System.out.println("Book returned!");
                return;
            }
        }
    }
}