package q3;

import java.util.Scanner;

/**
 * <p>
 * This application instantiates and updates on book objects
 * that contains initial data of a book.
 * </p>
 *
 * @author Yongjian Zhang
 * @version 1.0
 */
public class Bookshelf {
    /**
     * <p>
     * This is the main method (entry point) that gets called by the JVM.
     * Drives the program.
     * </p>
     *
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // defines the informations for the book
        String title;
        String author;
        String publisher;
        int date;

        // generate scanner
        Scanner scan = new Scanner(System.in);
        
        // create two books
        final Book book1 = new Book("Snow White", "Grimm", 
                "Western Publishing", 1812);
        final Book book2 = new Book("Harry Potter", 
                "Rowling", "Bloomsburry", 1997);

        // print out the books by using toString method
        System.out.println(book1 + "\n" + book2);

        // update the books
        System.out.println("Update the first book: ");
        book1.inputBook();
                
        // get and set data for the first book
        title = book1.getTitle();
        author = book1.getAuthor();
        publisher = book1.getPublisher();
        date = book1.getCopyrightDate();
        
        // set data using set method
        book1.setTitle(title);
        book1.setAuthor(author);
        book1.setPublisher(publisher);
        book1.setCopyrightDate(date);
        
        // print out the updated bookshelf
        System.out.println("Your updated bookshelf: \n" + book1 + "\n" + book2);

        System.out.println("Question three was called and ran sucessfully.");

        // close scanner
        scan.close();
    }

}
