/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

    private boolean[] Books;

    public Library() {
        this.Books = new boolean[]{true,false};
    }

    public Library(boolean Books) {
        this.Books = new boolean[]{Books};
    }

    public boolean[] isBooks() {
        return Books;
    }

    public void setBooks(boolean[] books) {
        Books = books;
    }

}
