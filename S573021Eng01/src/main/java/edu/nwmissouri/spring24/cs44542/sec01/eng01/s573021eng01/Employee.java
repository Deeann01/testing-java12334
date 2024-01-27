/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec01.eng01.s573021eng01;

/**
* Class: 44542-01 Object-Oriented Programming
*
* @author Deepika Annapureddy
* Description: Making sure everything works
* Due: 01/26/2024
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
*/

/**
 * Book Class
 * @author Deepika Annapureddy
 */
public class Employee {
    
    //Instance Variables
    private String firstName;
    private String lastName ;
    private double salPerAnnum;
    private static final double BONUS_PERCENTAGE  = 10.80; // Constant discount percentage

    /**
     * Constructor for creating an Employee object.
     *
     * @param firstName  The first name of the employee.
     * @param lastName   The last name of the employee.
     * @param salPerAnnum The annual salary of the employee.
     */

    // Constructor with parameters
    public Employee(String firstName, String lastName, double salPerAnnum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salPerAnnum = salPerAnnum;
    }
    
    public double calculateBonus() {
        return (this.salPerAnnum * BONUS_PERCENTAGE)/100;
    }


    /**
     * To string Method
     * @return formatted string
     */
    @Override
    public String toString() {
       return String.format("%s %s's bonus amount per Annum is %.2f.", firstName, lastName, calculateBonus());
                
    }
}
    

