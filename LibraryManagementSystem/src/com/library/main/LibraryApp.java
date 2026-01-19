// File: com.library.main.LibraryApp.java
package com.library.main;
import com.library.model.Book;
import com.library.service.LibraryServiceImpl;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryServiceImpl service = new LibraryServiceImpl();
     // 2. Add some dummy data to the ArrayList
        service.addBook(new Book(101, "Java Basics"));
        service.addBook(new Book(102, "OOPs Concepts"));

        // 3. Display the books to see if it works
        System.out.println("--- Current Library Inventory ---");
        service.displayAllBooks();
        
        try (Scanner sc = new Scanner(System.in)) {
			// Simple Loop for Console Menu
			while(true) {
			    System.out.println("\n1. Add Book 2. Show Books 3. Exit");
			    int choice = sc.nextInt();
			    if(choice == 3) break;
			    
			    switch(choice) {
			        case 1:
			            System.out.println("Enter ID and Title:");
			            service.addBook(new Book(sc.nextInt(), sc.next()));
			            break;
			        case 2:
			            service.displayAllBooks();
			            break;
			    }
			}
		}
    }
}