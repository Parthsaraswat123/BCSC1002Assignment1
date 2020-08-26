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
