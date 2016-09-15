package q3;

import java.util.Scanner;

/**
 * Book class.
 * 
 * @author ROGER
 * @version 1.0
 */

public class Book {

    /**
     * Book title.
     */
    private String title;

    /**
     * Book author.
     */
    private String author;

    /**
     * Book publisher.
     */
    private String publisher;

    /**
     * Book copy right date.
     */
    private int copyrightDate;

    /**
     * Constructor.
     */
    public Book() {

    }

    /**
     * Constructor for object of type Book.
     * 
     * @param bookTitle
     *            Reference of the bookTitle.
     * @param bookAuthor
     *            Reference of the bookAuthor.
     * @param bookPublisher
     *            Reference of the bookPublisher.
     * @param bookDate
     *            Reference of the bookDate.
     */
    public Book(String bookTitle, String bookAuthor, 
            String bookPublisher, int bookDate) {
        title = bookTitle;
        author = bookAuthor;
        publisher = bookPublisher;
        copyrightDate = bookDate;
    }

    /**
     * Sets up the scanner for the input.
     * Gets the input from the user.
     */
    public void inputBook() {
        Scanner scan = new Scanner(System.in);

        // scan for inputs from the user
        System.out.println("Please enter the book title, " 
        + "author, publisher and copyright dates: ");
        title = scan.nextLine();
        author = scan.nextLine();
        publisher = scan.nextLine();
        copyrightDate = Integer.parseInt(scan.nextLine());

        // close scanner
        scan.close();
    }

    /**
     * Gets book title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the book title.
     * 
     * @param title
     *            the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the book author.
     * 
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the book author.
     * 
     * @param author
     *            the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the book publisher.
     * 
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the book publisher.
     * 
     * @param publisher
     *            the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets the copyright date of the book.
     * 
     * @return the copyrightDate
     */
    public int getCopyrightDate() {
        return copyrightDate;
    }

    /**
     * Sets the copyright date of the book.
     * 
     * @param copyrightDate
     *            the copyrightDate to set
     */
    public void setCopyrightDate(int copyrightDate) {
        this.copyrightDate = copyrightDate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author 
                + ", publisher=" + publisher + ", copyrightDate="
                + copyrightDate + "]";
    }

}
