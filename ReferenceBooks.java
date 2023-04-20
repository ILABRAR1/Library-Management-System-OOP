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
import java.util.ArrayList;
import java.util.Scanner;

public class ReferenceBooks extends Books {
  
    Scanner input= new Scanner(System.in);
    ArrayList<ReferenceBooks> Reference= new ArrayList<ReferenceBooks>();
    
    public ReferenceBooks() {
        
    }

     public ReferenceBooks(int book_id, String title, String author,typeOfBook Classification ) { //constructor with 3 parameters
        super(book_id, title, author);
        Classification= typeOfBook.Reference;
    }

    public String getClassification() {
        return Classification;
    }

    
      public void add() { // to add new books 

        System.out.println("Enter the id of the book");
        super.book_id = input.nextInt();

        System.out.println("Enter the name of the book");
        super.title = input.nextLine();
        input.nextLine();

        System.out.println("Enter Author name ");
        super.author = input.nextLine();

        Reference.add(this);
        BookList.add(this);

    }

    @Override
    public String toString() {
        return "ReferenceBooks{" + "Classification=" + Classification + '}';
    }
    
    
   

   
}

    

