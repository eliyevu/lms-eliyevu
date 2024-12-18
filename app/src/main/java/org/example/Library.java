package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private String name;
    private String address;
    private List<Book> books;
    private List<Patron> patrons;
    private Map<Book, Patron> borrowedBooks;

    //Constructor
    public Library(String name, String address){
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
        this.borrowedBooks = new HashMap<>();
    }
    //Getters and setters
    public String getName(){ return name; }
    public String getAddress(){ return address; }
    public void setAddress(String address){ this.address = address; }
    public void setName(String name){ this.name = name; }

    //Method to add a book
    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " was added to the library.");
    }
    //Method to remove a book
    public void removeBook(Book book){
        if(books.remove(book)){
            System.out.println(book.getTitle() + " was removed from the library.");
        } else {
            System.out.println(book.getTitle() + " not found in the library.");
        }

    }
    //Method to add a patron
    public void registerPatron(Patron patron){
        patrons.add(patron);
        System.out.println("Patron " + patron.getName() + " registered successfully.");
    }
    //Method to remove a patron
    public void removePatron(Patron patron){
        if (patrons.remove(patron)){;
            System.out.println("Patron " + patron.getName() + " removed successfully.");
        } else {
            System.out.println("Patron " +patron.getName() + " does not exist in the library.");}
    }
    //Method to borrow book
    public void borrowBook(Book book, Patron patron){
        if(books.contains(book) && ! borrowedBooks.containsKey(book)){
            borrowedBooks.put(book, patron);
            System.out.println("Book " + book.getTitle() + " borrowed by "+patron.getName()+" successfully.");
        } else {
            System.out.println("Book " + book.getTitle() + " not available.");
        }
    }
    //Method to return book
    public void returnBook(Book book){
        if(borrowedBooks.containsKey(book)){
            borrowedBooks.remove(book);
            System.out.println("Book " + book.getTitle() + " returned.");
        } else {
            System.out.println("Book " + book.getTitle() + " was not borrowed.");
        }
    }
    //Method to search book by title
    public List<Book> searchBooksByTitle(String title){
        List<Book> results = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(title.toLowerCase())){
                results.add(book);
            }
        }
        return results;
    }
    //Method to search a book by author
    public List<Book> searchBooksByAuthor(String author){
        List<Book> results = new ArrayList<>();
        for(Book book : books){
            if(book.getAuthor().toLowerCase().contains(author.toLowerCase())){
                results.add(book);
            }
        }
        return results;
    }
    //Method to list books
    public List<Book> listBooksAvailable(){
        List<Book> availableBooks = new ArrayList<>(books);
        availableBooks.removeAll(borrowedBooks.keySet());
        return availableBooks;
    }
    //Method to list borrowed books
    public List<Book> listBooksBorrowed(){
        List<Book> booksBorrowed = new ArrayList<>(books);
        booksBorrowed.removeAll(borrowedBooks.keySet());
        return booksBorrowed;

    }
    //Method to list patrons
    public List<Patron> listPatronsAvailable(){
        List<Patron> availablePatrons = new ArrayList<>(patrons);
        availablePatrons.removeAll(patrons);
        return availablePatrons;
    }


}

