/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import javax.print.DocFlavor;
import java.lang.reflect.Array;

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
    private String[] studentIssuedBook;

    public Student() {
        this.studentName = "Parth Saraswat";
        this.studentUniversityRollNumber = 191500529;
        this.studentIssuedBooksNumber = 1;
        this.studentIssuedBook = new String[]{"JAVA" + "A" + "Beginner's" + "Guide"};

    }

    public Student(String studentName, long studentUniversityRollNumber, int studentIssuedBooksNumber, String[] studentIssuedBook) {
        this.studentName = studentName;
        this.studentUniversityRollNumber = studentUniversityRollNumber;
        this.studentIssuedBooksNumber = studentIssuedBooksNumber;
        this.studentIssuedBook = studentIssuedBook;
    }

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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;
    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getStudentIssuedBooksNumber() {
        return studentIssuedBooksNumber;
    }

    public void setStudentIssuedBooksNumber(int studentIssuedBooksNumber) {
        this.studentIssuedBooksNumber = studentIssuedBooksNumber;
    }

    public String[] getStudentIssuedBooksNames() {
        return studentIssuedBook;
    }
    //
    public void setStudentIssuedBooksNames(String[] studentIssuedBooksNames) {
        this.studentIssuedBook = studentIssuedBooksNames;
    }

}
