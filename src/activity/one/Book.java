/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.one;

/**
 *
 * @author mvoctavianojr
 */
public class Book {

    String title;
    boolean borrowed;

// Creates a new Book
    public Book(String bookTitle) {
// Implement this method
    }

// Marks the book as rented
    public void borrowed() {
// Implement this method
    }

// Marks the book as not rented
    public void returned() {
// Implement this method
    }

// Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
// Implement this method
        return false;
    }

// Returns the title of the book
    public String getTitle() {
        return "";
    }

    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
