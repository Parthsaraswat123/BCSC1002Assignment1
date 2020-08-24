/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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

    // we can create special type of methods to access these fields outside the class.
    // 1. Getter Methods:
    // Observer methods / Accessor methods
    //we can use the getter methods to access the value of a filed i.e read it.

    // 2. Setter Methods:
    // Transformer methods / Mutator methods
    // we can use setter methods to set the value of the field i.e write it.

    /*
     * public <am:sameAsTheField> void set <NameOfTheField>(<SameAsTheField>) {}
     *
     */

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


}
