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

public class Library_database extends Books {

    Scanner input = new Scanner(System.in);

    String Classification;

    public Library_database() {
    }


    public Library_database(int book_id, String title, String author) {
        super(book_id, title, author);
    }

    @Override
    public void add() {

        System.out.println("Enter The Type of the Book : Scientefic , Reference or Novel");
        String ch = input.nextLine();
        if (ch.equalsIgnoreCase("Scientefic")) {
            ScienteficBooks S1 = new ScienteficBooks();
            S1.add();
            super.Classification=ch;

        } else if (Classification.equalsIgnoreCase("Reference")) {
            ReferenceBooks R1 = new ReferenceBooks();
            R1.add();
            super.Classification=ch;
        } else if (Classification.equalsIgnoreCase("Novel")) {
            NovelBooks N1 = new NovelBooks();
            N1.add();
            super.Classification=ch;

        }

    }

}

    

