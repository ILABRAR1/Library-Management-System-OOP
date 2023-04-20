/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangementsystem.pkgfinal;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class User {
    
    Scanner input = new Scanner(System.in);
    ArrayList<Student> StudentList = new ArrayList<Student>();
    int BorrowBook [][]=new int [200][7];
    
   
    protected String name;

    protected int University_ID;

    protected String password;

    /**
     * constructor without parameter
     */
    public User() {
    }

    /**
     *
     * @param University_ID
     * @param name
     * @param password
     */
    public User(int University_ID, String name, String password) {
        this.name = name;
        this.University_ID = University_ID;
        this.password = password;
    }

    /**
     *
     * @return user name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return user ID
     */
    public int getUniversity_ID() {
        return University_ID;
    }

    /**
     *
     * @param University_ID
     */
    public void setUniversity_ID(int University_ID) {
        this.University_ID = University_ID;
    }

    /**
     *
     * @return user password
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Ask user if he student or employee
     */
    public void create() {
        System.out.println("Student or Employee ?");
        String sORe = input.next();
        if (sORe.equalsIgnoreCase("student")) {
            User s = new Student();
            s.create();
            theOperation3();

        } else if (sORe.equalsIgnoreCase("Employee")) {
            User e = new Staff();
            e.create();
            theOperation2();

        }
    }

    /**
     * Ask user if he student or employee
     */
    public void logIn() {
        System.out.println("Student or Employee ?");
        String sORe = input.next();
        if (sORe.equalsIgnoreCase("student")) {
            User s = new Student();
            s.logIn();
            theOperation3();

        } else if (sORe.equalsIgnoreCase("Employee")) {
            User e = new Staff();
            e.create();
            theOperation2();

        }
    }

    /**
     * to make the password valid and safe
     */
    public void validPassword() {
              
        System.out.print("1. A password must have at least eight characters.\n"
                + "2. A password consists of only letters and digits.\n"
                + "3. A password must contain at least two digits\n");
 
        boolean flag = false;
 
        while (flag == false) {
            password = input.nextLine();
            try{ // Exceptions Handling
            if (password.length() < 8) {
                throw new Exception("password must have at least eight characters");
            } else {
                int numOfLetters = 0;
                int numOfdigits = 0;
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isLetter(password.charAt(i))) {
                        numOfLetters++;
                    }
 
                    if (Character.isDigit(Integer.valueOf(password.charAt(i)))) {
                        numOfdigits++;
                    }
                }
                if ((numOfLetters + numOfdigits) == password.length() && numOfdigits >= 2) {
                    flag = true;
                } else {
                    flag = false;
                    System.out.println(" A password consists of only letters and digits.\n"
                            + " A password must contain at least two digits\n");
 
                    }
                }
        }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    }

    /**
     * Ask  the user if he wants to login or signup
     */
    public void theOperation1() {

        System.out.println("To Log in Enter ( login ) \n"
                + "To create new acount Enter ( signup ) \n ");
        
        String EnterUser = input.next();
        
        
       
            if (EnterUser.equalsIgnoreCase("login")) {
                this.logIn();
                
            } else if (EnterUser.equalsIgnoreCase("signup")) {
                this.create();
               
            } else {
                System.out.println("You enter the wrong word");
            }
        
    }

    /**
     * Ask the employee if he wants to add, borrow or return 
     */
    public void theOperation2() {

        Staff staff = new Staff();
        
        System.out.println("To Add a new Book Enter ( add ) \n");
        System.out.println("To Borrow Books Enter ( Borrow ) \n");
        System.out.println("To Return Books Enter ( Return ) \n");
        System.out.println("To Exit Books Enter ( Exit ) \n");
        
        String EnterUser = input.next();

        if (EnterUser.equalsIgnoreCase("add")) {
            staff.add();
            System.out.println();
            System.out.println(" adding books was successfully completed ");
            System.out.println();
        } else if (EnterUser.equalsIgnoreCase("Borrow")) {
            staff.borrow();
            System.out.println();
            System.out.println(" the borrowing was successfully completed ");
            System.out.println();
            theOperation2();
        } else if (EnterUser.equalsIgnoreCase("Return")) {
            staff.Return();
            System.out.println();
            System.out.println(" the returning was successfully completed ");
            System.out.println();
            theOperation2();
        } else if (EnterUser.equalsIgnoreCase("Exit")) {
            System.out.println(" Thank you <3 ");
        } else {
            System.out.println("You enter the wrong Word");
        }
    }
    
    /**
     * Ask the student if he wants borrow books or return them
     */
    public void theOperation3(){
        
        Student student = new Student();
        
        System.out.println("To Borrow Books Enter ( Borrow ) \n");
        System.out.println("To Return Books Enter ( Return ) \n");
        System.out.println("To Exit Books Enter ( Exit ) \n");
        
        String EnterUser = input.next();

        if (EnterUser.equalsIgnoreCase("Borrow")) {
            student.borrow();
            System.out.println();
            System.out.println(" the borrowing was successfully completed ");
            System.out.println();
            theOperation3();
        } else if (EnterUser.equalsIgnoreCase("Return")) {
            student.Return();
            System.out.println();
            System.out.println(" the returning  was successfully completed ");
            System.out.println();
            theOperation3();
        } else if (EnterUser.equalsIgnoreCase("Exit")) {
            System.out.println(" Thank you <3 ");
        } else {
            System.out.println("You enter the wrong Word");
        }
    }
}

    

