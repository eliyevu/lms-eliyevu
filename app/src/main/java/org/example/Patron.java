package org.example;

import java.util.List;
import java.util.ArrayList;

public class Patron {
    private String name;
    private String idNumber;
    private List<Book> borrowedBooks;
    private int borrowedBooksCount;
    //Constructor
    public Patron(String name, String idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.borrowedBooks = new ArrayList<>();
    }
    //Getters
    public String getName(){ return name; }
    public String getIdNumber(){ return idNumber; }
    public List<Book> getBorrowedBooks(){ return borrowedBooks; }

    //Setters
    public void setName(String name){ this.name = name; }
    public void setIdNumber(String idNumber){ this.idNumber = idNumber; }

    //Method to add a borrowed book
    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    //Method to show a patron has borrowed a book or not
    public void borrowBook(Book book){
        if(book.isBookAvailable){
            addBorrowedBook(book);
            book.borrowBook();
            System.out.println(name + " borrowed "+ book.getTitle() + "") ;
        } else{
            System.out.println(book.getTitle() +" is not available") ;
        }
    }

    //Method to show a patron has returned a borrowed book or not
    public void returnBook(Book book){
        if(borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println(name + " returned "+ book.getTitle() + "") ;
        } else{
            System.out.println(name +" did not borrow "+book.getTitle() + "") ;
        }
    }
    //Method to view borrowed books
    public void displayBooks(){
        System.out.println("Borrowed books:");
        if(borrowedBooks.isEmpty()){
            System.out.println("No books available");
        } else{
            for(Book book : borrowedBooks){
                System.out.println(book.getTitle() ) ;
            }
        }

    }

}
