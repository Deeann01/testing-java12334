/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec01.classes;

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

/**
 * Book Class
 * @author Deepika Annapureddy
 */
public class Book {
    
    //Instance Variables
    private String title;
    private String author;
    private double price;
    private double taxPercentage;
    private static final double DISCOUNT = 10.00; // Constant discount percentage
    private double totalPrice;
    private double finalPrice;
    
    /**
     * Book Constructor to initialize attributes
     * @param title String Name of the book
     * @param author String Author of the Book
     * @param price double price for each book
     * @param taxPercentage double Tax Percentage
     */

    // Constructor with parameters
    public Book(String title, String author, double price, double taxPercentage) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.taxPercentage = taxPercentage;
        this.totalPrice = calcTotalPrice();
        this.finalPrice = calcFinalPrice();
    }
    /**
     * No-argument constructor
     */

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.taxPercentage = 0.0;
        this.totalPrice = calcTotalPrice();
        this.finalPrice = calcFinalPrice();
    }

    /**
     * Getter method for title
     * @return title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Setter method for title
     * @param title String name of the Book
     */

    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Getter method for Author
     * @return Author
     */

    public String getAuthor() {
        return author;
    }
    /**
     * Setter method for Author
     * @param author String Author of the Book
     */

    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Getter method for price
     * @return price
     */

    public double getPrice() {
        return price;
    }
    /**
     * Setter method for price 
     * @param price double price for each book
     */

    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Getter method for taxPercentage
     * @return taxPercentage
     */

    public double getTaxPercentage() {
        return taxPercentage;
    }
    /**
     * Setter method for taxPercentage
     * @param taxPercentage double Tax Percentage
     */

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    /**
     * Method to calculate totalPrice
     * @return totalPrice
     */

   
    public double calcTotalPrice() {
        totalPrice = price + (price * taxPercentage / 100);
        return totalPrice;
    }

    /**
     * Method to calculate finalPrice
     * @return finalPrice
     */
    public double calcFinalPrice() {
        finalPrice = totalPrice - (totalPrice * DISCOUNT / 100);
        return finalPrice;
    }

    /**
     * To string Method
     * @return formatted string
     */
    @Override
    public String toString() {
        return
                "Title of the Book: " + title + '\n' +
                "Author of the Book: " + author + '\n' +
                "Tax Percentage: " + String.format("%05.2f", taxPercentage)  +'\n'+
                "Discount: " + String.format("%05.2f",DISCOUNT) +'\n'+
                "Total Price of the Book including tax: $" + String.format("%05.2f",calcTotalPrice()) +'\n'+
                "Final Price of the Book after discount: $" + String.format("%05.2f",calcFinalPrice());
    }
}
