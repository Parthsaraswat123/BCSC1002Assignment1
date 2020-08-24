/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    // Components of a Definition Class in Java
    // 1. private fields
    // 2. public getters & setters
    // 3. Constructors
    // 4. toString() method
    // 5. equals() and hashCodes() method

    // Student
    // 1. a field to store the name of the student (first name, middle name, last name- all String).
    //        2. a field to store the university roll number of the student (long).
    //         3. a field to store the number of books issued by the student (int).
    //        4. a field to store all the names of the books issued by the student (Book[]).

    // rules for creating fields
    // 1. Set the visibility modifier of the fields to private unless otherwise specified.
    // 2. Set the access modifier of th fields to non-static unless otherwise specified.

    private String studentName;
    private long studentUniversityRollNumber;
    private int studentIssuedBooksNumber;
    private String[] studentIssuedBooksNames;

}
