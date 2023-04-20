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
public class Staff extends User {
     
   private String department;
    public static int counter = 0;
    private int eNumber;

    public Staff() {//counstructor with no parameter
    }

    public Staff(int University_ID, String name, String password, String department) { //counstructor with 4 parameters 
        super(University_ID, name, password);
        this.department = department;
    }

    @Override
    public void create() {
        User[] numberOfEmployee = new Staff[10]; //just 10 employees 
        System.out.println(" Enter your Id: ");
        University_ID = input.nextInt();
        System.out.println(" Enter your full name: ");
        name = input.nextLine();
        input.nextLine();
        System.out.println(" Enter your password: ");
        super.validPassword(); //check if the password is valid or not 
        System.out.println("Enter the name of your department: ");
        department = input.nextLine();
        numberOfEmployee[eNumber] = new Staff(University_ID, name, password, department); // store new Employee at index eNumber 
        counter++;
        eNumber = counter; //go to next index and save it 
        super.theOperation2();//next oeration
    }

    public void logIn() { //if the user have an account 
        System.out.println(" Enter your Id: ");
        University_ID = input.nextInt(); // the user will enter his id 
        int ifElementLogin = StudentList.indexOf(University_ID); //to check if the user have an account or not 
        if (ifElementLogin > 0) { // if ifElementLogin is positive number will countinue the operation and loggin
            System.out.println(" Enter your password: ");
            super.validPassword();   // check password if it contain just 8 letters and charcters and at least 2 integers 
            super.theOperation2();  //next operation
        } else { // if ifElementLogin is negative number , that means he/she does not have an account and have to create a new account 
            System.out.println("Sorry! , You do not have an acount\n"
                    + " to create new acount Enter ( signup )");
            String EterUser = input.next();
            if (EterUser.equalsIgnoreCase("signup")) {
                super.create();
            }
        }
    }

    public void add() {

        Library_database dataBase = new Library_database();

        System.out.println("How many books do you want to add ? ");
        int NoOfBooks = input.nextInt();
        for (int i = 0; i < NoOfBooks; i++) { //to complete the information of books
            dataBase.add();
        }
    }

    public void borrow() {

        System.out.println("How many Books do you want to Borrow ? ");
        int BorrBook = input.nextInt();
        if (BorrBook <= 5) {
            System.out.println("Enter your ID");
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
                                    }
                                    break;
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

    public void Return() {
        System.out.println("Enter your ID");
        University_ID = input.nextInt();
        for (int i = 0; i < BorrowBook.length; i++) {
            if (BorrowBook[i][0] == University_ID) { //if the student borrowed books before , we will check if he return the book or not 
                for (int j = 1; j < BorrowBook[i].length; j++) {
                    BorrowBook[i][j] = 0;
                }
                break;
            }
        }
        System.out.println("the operation completed successfully");
        System.out.println("");

    }
}

    
  


    

