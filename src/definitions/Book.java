/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {

    // Components of a Definition Class in Java
    // 1. private fields
    // 2. public getters & setters
    // 3. Constructors
    // 4. toString() method
    // 5. equals() and hashCodes() method

    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    public Book() {
        this.bookName = "JAVA A Beginner's Guide";
        this.authorName = "Herbert Schildt";
        this.bookISBNNumber = "978-1-26-044022-5";

    }

    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }

    // 4. toString() method:
    // used the display the attributes of an objects, or to print an object values.


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", bookISBNNumber='" + bookISBNNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(getBookISBNNumber(), book.getBookISBNNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), getBookISBNNumber());
    }
}
