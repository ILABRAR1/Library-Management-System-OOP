/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangementsystem.pkgfinal;

/**
 *
 * @author Windows 10
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Student extends User implements Borrowing {

    Scanner input = new Scanner(System.in);

    private String course;

    public Student() {
    }

    public Student(int University_ID, String name, String password, String course) {
        super(University_ID, name, password);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void create() {
        System.out.println(" Enter your Id: ");
        University_ID = input.nextInt();

        int ifElementLogin = StudentList.indexOf(University_ID);
        if (ifElementLogin > 0) {
            System.out.println("You have an acount \n"
                    + "Enter 1 to log in ");
            int EterUser = input.nextInt();
            if (EterUser == 1) {
                super.logIn();
            }
        }
        System.out.println(" Enter your full name: ");
        name = input.nextLine();
        input.nextLine();
        System.out.println(" Enter your password: ");
        super.validPassword();
        System.out.println(" Enter the name of your course: ");
        course = input.nextLine();

        StudentList.add(this); //array List for new Student 
    }

    public void logIn() {
        System.out.println(" Enter your Id: ");
        University_ID = input.nextInt();
        int ifElementLogin = StudentList.indexOf(University_ID);
        if (ifElementLogin > 0) {
            System.out.println(" Enter your password: ");
            super.validPassword();
            super.theOperation3();
        } else {
            System.out.println("Sorry! , You do not have an acount\n"
                    + " to create new acount Enter (signin) ");
            String EnterUser = input.next();
            if (EnterUser.equalsIgnoreCase("signin")) {
                super.create();
            } else {
                System.out.println("You enter the wrong Word");

            }
        }
    }

    @Override
    public void borrow() {

        System.out.println("How many Books do you want to Borrow ? ");
        int BorrBook = input.nextInt();
        if (BorrBook <= 5) {
            System.out.println("Enter your University ID");
            University_ID = input.nextInt();
            for (int i = 0; i < BorrowBook.length; i++) { //to check if this id is exist or not 
                for (int j = 1; j <= BorrBook; j++) {
                    if (BorrowBook[i][0] == University_ID) {  //if the student borrowed books before , we will check if he return the book or not 
                        if (BorrowBook[i][6] == 1) {
                            System.out.println(" Sorry!, You are not allowed to Borrow Books "); //the user have to return the books 
                        } else {
                            for (int row = 0; row < BorrowBook.length; row++) { //to check if this id is exist or not 
                                if (BorrowBook[row][0] == 0) {
                                    BorrowBook[row][0] = University_ID;
                                    BorrowBook[row][6] = 1;

                                    for (int col = 1; col <= BorrBook; col++) {
                                        System.out.println("Enter Book ID");
                                        System.out.println("Abrrrrrr");
                                        BorrowBook[row][col] = input.nextInt();
                                    }break;
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < BorrowBook.length; i++) { //to check if this id is exist or not 
                if (BorrowBook[i][0] != University_ID) {
                  if (BorrowBook[i][0] == 0) {
                      BorrowBook[i][0] = University_ID;
                      BorrowBook[i][6] = 1;
                      for (int j = 1; j <= BorrBook; j++) {
                            System.out.println("");
                            System.out.println("Enter Book ID");
                            BorrowBook[i][j] = input.nextInt();
                                
                           }
                         break;
                        }

                    }
                }
        } else {
            System.out.println("Sorry! , You can only borrow 5 books or less ");
        }

    }

    @Override
    public void Return() {
        System.out.println("Enter your ID");
        University_ID = input.nextInt();
        for (int i = 0; i < BorrowBook.length; i++) {
            if (BorrowBook[i][0] == University_ID) { //if the student borrowed books before , we will check if he return the book or not 
                for (int j = 1; j < BorrowBook[i].length; j++) {
                    BorrowBook[i][j] = 0;
                }break;
            }
        }
        System.out.println("the operation completed successfully");
         System.out.println("");

    }}
    
      

