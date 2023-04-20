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
 public abstract class Books implements Borrowing {

    protected int book_id;
    protected String title, author;
    protected String Classification;
    protected boolean borrowed;
    
    enum typeOfBook { Scientefic, Reference, Novel}; //classification
    
    ArrayList <Books> BookList =new ArrayList<Books> ();  
    public Books() { //constructor without parameter

    }

    public Books(int book_id, String title, String author) { //constructor with 3 parameters
        this.book_id = book_id;
        this.title = title;
        this.author = author;

    }

    public Books(int book_id, String title, String author, boolean borrowed) { //constructor with 4 parameters
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;

    }

    public boolean isBorrowed() { //get Borrowed Method 

        return borrowed;
    }

    public void setBorrowed(boolean borrowed) { //set Borrowed Method 

        this.borrowed = borrowed;
    }

    public int getBook_id() { //get Book_id Method 

        return book_id;
    }

    public void setBook_id(int book_id) { // set Book_id Method
        this.book_id = book_id;
    }

    public String getTitle() { //get Title Method

        return title;
    }

    public void setTitle(String title) { //set Title Method
        this.title = title;
    }

    public String getAuthor() { //get Author Method
        return author;
    }

    public void setAuthor(String author) { //set Author Method

        this.author = author;
    }

   
    @Override
    public void borrow() { //if a student wants to borrow a book or not 

        setBorrowed(true);
    }

    @Override
    public void Return() {  //if a student wants to return a book or not 

        setBorrowed(false);
    }

   public abstract void add(); //add new Books

    @Override
    public String toString() {
        return "Books{" + "book_id=" + book_id + ", title=" + title + ", author=" + author + ", borrowed=" + borrowed + '}';
    }

}

    

