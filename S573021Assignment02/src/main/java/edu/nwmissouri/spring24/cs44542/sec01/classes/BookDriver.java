/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01.classes;
import java.util.Scanner;

 /**
* Class: 44542-01 Object-Oriented Programming
*
* @author Deepika Annapureddy
* Description: Making sure everything works
* Due: 01/24/2024
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
*/

public class BookDriver {
    
    /**
     * Main Method
     * @param args command line arguments
     */

    public static void main(String[] args) {
  
        Scanner bookScanner = new Scanner(System.in);

        
        System.out.print("Enter the Title of the Book: ");
        String title = bookScanner.nextLine();
        
        System.out.print("Enter the Author of the Book: ");
        String author = bookScanner.nextLine();
        
        System.out.print("Enter the Price of the Book: ");
        double price = bookScanner.nextDouble();
        
        System.out.print("Enter the tax of the Book in Percentage: ");
        double taxPercentage = bookScanner.nextDouble();

        
        Book book1 = new Book(title, author, price, taxPercentage);

       
        System.out.println("***** The details of book1 object are as follows: ***** ");
        System.out.println(book1.toString());

       
        Book book2 = new Book();


        System.out.println("***** The details of book2 object are as follows: *****");
        System.out.println(book2.toString());

        book2.setTitle("Effective Java");
        book2.setAuthor("Joshua Bloch");
        book2.setPrice(250);
        book2.setTaxPercentage(8.11);

       
        System.out.println("***** The details of book2 object are as follows: *****");
        System.out.println(book2.toString());

        bookScanner.close();
        
        System.out.println("1. In object-oriented programming, a class is a basic building block. It can be defined as template that describes the data and behaviour associated with the class instantiation. Instantiating is a class is to create an object (variable) of that class that can be used to access the member variables and methods of the class.");
        System.out.println("2. Key components of a Java class declaration include:"+'\n'+
    "- Class name: Identifies the class."+'\n'+
    "- Class modifiers: Keywords like public or private for access levels."+'\n'+
    "- Superclass: The class from which it inherits."+'\n'+
    "- Interfaces: Implemented interfaces."+'\n'+
    "- Class body: Contains fields, methods, and nested classes.");
    System.out.println("3. The constructor in a Java class is essential for initializing an object's state. Named after the class, it is automatically invoked during object creation and differs from other methods by lacking a return type.");
    System.out.println("4. It's not permissible for a constructor in Java to have a return type. Constructors are designed for object initialization during creation and do not return any value.");
    System.out.println("5. Methods in Java classes share common characteristics:"+'\n'
   +"- Method signature: Includes the method name and parameter list."+'\n'
   +"- Return type: Specifies data returned or 'void' if none."+'\n'
   +"- Access modifiers: Determine method visibility."+'\n'
   +"- Method body: Contains executable code."+'\n'
   +"- Parameters: Input values."+'\n'
   +"- Exception handling: Specifies potential exceptions.");
       

    }
}
