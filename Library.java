/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymangementsystem.pkgfinal;

import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class Library {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        User UserObject = new User();
        Staff StaffObject = new Staff();

        System.out.println("Hello! , Welcome to UQU Library");
        System.out.println();

        UserObject.theOperation1();
       
       

    }

}