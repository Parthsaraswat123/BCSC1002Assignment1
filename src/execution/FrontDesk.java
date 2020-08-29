/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ADD_STUDENTNAME = 1;
    public static final int CHECK_STUDENT_UNIVERSITY_ROLL_NUMBER = 2;
    public static final int CHECK_STUDENT_ISSUED_BOOK_NUMBER = 3;
    public static final int CHECK_STUDENT_ISSUED_BOOK_NAME = 4;

    public static void main(String[] args) {
        System.out.println("-=-=--=-=-Welcome To The Front Desk-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        Scanner scanner = new Scanner(System.in);
        int customerInput = scanner.nextInt();
        scanner.close();

    }

    }

