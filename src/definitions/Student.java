/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

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


    // 4. toString() method:
    // used the display the attributes of an objects, or to print an object values.


    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentUniversityRollNumber=" + studentUniversityRollNumber +
                ", studentIssuedBooksNumber=" + studentIssuedBooksNumber +
                ", studentIssuedBook=" + Arrays.toString(studentIssuedBook) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNumber() == student.getStudentUniversityRollNumber() &&
                getStudentIssuedBooksNumber() == student.getStudentIssuedBooksNumber() &&
                Objects.equals(getStudentName(), student.getStudentName()) &&
                Arrays.equals(studentIssuedBook, student.studentIssuedBook);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentName(), getStudentUniversityRollNumber(), getStudentIssuedBooksNumber());
        result = 31 * result + Arrays.hashCode(studentIssuedBook);
        return result;
    }
}
