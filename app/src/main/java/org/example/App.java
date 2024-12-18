/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Welcome to to the library!." ;
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        Library library = new Library("Balme Library", "University of Ghana");
        Book book1 = new Book("Arrow Of God", "Chinua Achebe", "978-0385014809", 1964);
        Book book2 = new Book("1984", "George Orwell", "1949", 1949);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("Avalaible books: ");
        for(Book book: library.listBooksAvailable()){
            System.out.println(book.getTitle() + " by "+book.getAuthor());
        }
        System.out.println(library.searchBooksByAuthor("George Orwell"));

    }
}
