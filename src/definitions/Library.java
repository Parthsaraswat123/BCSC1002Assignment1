/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

// Components of a Definition Class in Java
    // 1. private fields
    // 2. public getters & setters
    // 3. Constructors
    // 4. toString() method
    // 5. equals() and hashCodes() method

    // rules for creating fields
    // 1. Set the visibility modifier of the fields to private unless otherwise specified.
    // 2. Set the access modifier of th fields to non-static unless otherwise specified.

    private boolean[] Books;

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

    public boolean[] getBooks() {
        return Books;
    }

    public void setBooks(boolean[] books) {
        Books = books;
    }

}
