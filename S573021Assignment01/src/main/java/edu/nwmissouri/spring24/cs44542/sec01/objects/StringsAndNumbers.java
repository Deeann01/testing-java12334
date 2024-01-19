/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.nwmissouri.spring24.cs44542.sec01.objects;
import java.util.Random;

 /**
* Class: 44542-01 Object-Oriented Programming
*
* @author Deepika Annapureddy
* Description: Making sure everything works
* Due: 01/18/2024
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student, internet, or any other source.
* I will not share my source code with anyone under any circumstances.
*/

public class StringsAndNumbers{

    public static void main(String[] args) {
        String stringExample ="Working with String Methods in Java!";
        
        
        System.out.println("******************************STRING CLASS*************************************");
        System.out.println("The Sring is : "+stringExample);
        System.out.println("The Length of the string is:    "+ stringExample.length());
        char ch;
        ch = stringExample.charAt(5);
        System.out.println("The character at the 5th index is :"+ ch);
        
        
        String extractedSubstringS573021 = stringExample.substring(11, 17);
        System.out.println("The substring from index 11 to 17 is: " + extractedSubstringS573021);
        if (stringExample.contains("Methods")) {
            System.out.println("The substring Methods is present within the stringExample");
        } else {
            System.out.println("Not Present");
        }
    
            
        String firstName = "Deepika";
        String lastName = "Annapureddy";
        String fullName = firstName + "_" + lastName;
        System.out.println("The Concatenated  String is : " + fullName);
        String lowerCaseFullName = fullName.toLowerCase();
        System.out.println("The Concatenated  String in lowercase is : " + lowerCaseFullName);

    
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("The Concatenated  String in uppercase is : " + upperCaseFullName);
        
        
        String sampleText = "There are many String methods in Java!";

        String NewText = sampleText.replace("many", "various");

        System.out.println("The result after replacement is : " + NewText);
        String searchText = "  Java is an Object-Oriented Programming Language. Java is a high level, robust and secure programming language.  ";

        
        int firstIndex = searchText.indexOf("Java");
        int secondIndex = searchText.indexOf("Java", firstIndex + 1);
        System.out.println("The index of second occurrence of Java is:" + secondIndex);

        
        searchText = searchText.trim();
        System.out.println("The searchText after trimming the spaces at the beginning and end is: " + searchText + "\"");
        
        String messageA="hello";
        String messageB="HELLO";
        
        boolean areEqualIgnoreCase = messageA.equalsIgnoreCase(messageB);
        System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is: " + areEqualIgnoreCase);

        boolean areEqual =   messageA.equals(messageB);
        System.out.println("The result of comparing messageA and messageB considering case sensitivity is:  " + areEqual);
        
        String fullNameS573021 = firstName + "-" + lastName;

        System.out.println("The  result after joining  firstName and lastName with a hyphen is : "+ fullNameS573021);
        
        System.out.println("******************************RANDOM CLASS*************************************");
     
        Random R=new Random();
        int Team2_player1=R.nextInt(10)+21;
        int Team2_player2=R.nextInt(10)+21;
        int Team2_totalscore=Team2_player1+Team2_player2;
        System.out.println("The Total Score for Team 2 is: "+Team2_totalscore);
        Random R1=new Random(20);
        System.out.println("Random values between 0.0 and 1.0 with seed value of 20");
        for(int i=1;i<=5;i++)
        {
         float A=R1.nextFloat();
          System.out.println("Random Value "+i+" "+A);
        }
        System.out.println("Random values between 0.0 and 1.0 with no seed value");
        Random R2=new Random();
         for(int j=1;j<=5;j++)
         {
          float B=R2.nextFloat();
          System.out.println("Random Value "+j+" "+B);
          }
        
         System.out.println("******************************MATH CLASS*************************************");
         
        int absoluteDifference5730231 = Math.abs(-20 - 15);
        System.out.println("The absolute difference between -20 and  15 is : " + absoluteDifference5730231);

       
        double multiplicationResult5730231 = 14.6 * 3.8;
        float roundedResult5730231 = (int) Math.ceil(multiplicationResult5730231);
        System.out.println("The result of (14.6 * 3.8) rounded  to the nearest imteger is: " + roundedResult5730231);

   
        double divisionResult = 29.7 / 4.2;
        float floorValue = (int) Math.floor(divisionResult);
        System.out.println("The floor value of (29.7/4.2) is: " + floorValue);

        
        double squareRootResult = Math.sqrt(Math.pow(10, 2) + Math.pow(20, 2));
        System.out.println("The square root of the sum of squares of 10 and 20 is: " + squareRootResult);

        double logarithmResult = Math.log(256) / Math.log(2);
        System.out.println("The value of logarithm base 2 of 256: " + logarithmResult);

    
        int minValue = Math.min(Math.min(-5, -10), Math.min(0, Math.min(15, 8)));
        System.out.println("The minimum value among -5, -10, 0, 15, and 8 is: " + minValue);

       
        int maxValue = Math.max(7 * 9, 40 / 5);
        System.out.println("The maximum value between the product of  7 and 9 and the quotient of 40 dividend by 5 is: " + maxValue);

        
        double sine30 = Math.sin(Math.toRadians(30));
        double cosine60 = Math.cos(Math.toRadians(60));
        double multiplicationSineCosine = sine30 * cosine60;
        System.out.println("The result of sine of 20 degrees multiplied by the cosine of 60 degrees is: " + multiplicationSineCosine);

       
        double tangentDifferenceS5730231 = Math.tan(Math.toRadians(45 - 30));
        System.out.println("The result of  the tangent of the difference between 45 and 30 degrees is: " + tangentDifferenceS5730231);

       
        double expressionResultS5730231 = (Math.abs(3 - 5) + Math.sqrt(25) - (7 * 2)) / 2;
        System.out.println("The result of the expression is:    " + expressionResultS5730231);
        
        System.out.println("The equals() method is used for case-sensitive comparison, checking if two strings are exactly the same, including the case of characters. On the other hand, the equalsIgnoreCase() method performs a case-insensitive comparison, considering the strings equal even if the case differs.");
        System.out.println("Setting a specific seed value in the generation of random numbers ensures that the sequence of generated random numbers is consistent and reproducible. This reproducibility is crucial in scenarios like debugging, testing, and scientific experiments, where the same sequence of random numbers is needed for consistency and verification.");
        System.out.println("Methods of the Math class are accessed in Java using static method calls. For example, Math.sqrt() is used to calculate the square root of a number, and Math.pow() is used to raise a number to a specified power. These methods provide common mathematical operations and functions for numerical computations.");
          }
}

   
    
