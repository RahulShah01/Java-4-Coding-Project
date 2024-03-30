package javaWeek4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Week4CodingProject {

  public static void main(String[] args) {
    
    
//    1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
    
           System.out.println("Question 1:" );
    
           int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
           
//            This prints out all the elements in the array. 
  
             for (int age : ages) {
               System.out.println(age);
                 }    
             
//    a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
             
             System.out.println("\nQuestion 1a:" );
             
             int result = ages[ages.length -1] - ages[0];
             System.out.println(result);

//    b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
             
             System.out.println("\nQuestion 1b:" );
             
             int[] ages2 = new int [9];
             System.out.println(ages2.length);

//    i. Make sure that there are 9 elements of type int in this new array.  
             
             
             System.out.println("\nQuestion 1b i:" );
                          
             ages2[0] = 5;
             ages2[1] = 12;
             ages2[2] = 25;
             ages2[3] = 65;
             ages2[4] = 11;
             ages2[5] = 30;
             ages2[6] = 90;
             ages2[7] = 96;
             ages2[8] = 101;
             
             for (int age : ages2) {
               System.out.println(age);
                 } 
                           
//    ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
             
             System.out.println("\nQuestion 1b ii:" );
             
             int result2 = ages2[ages2.length -1] - ages2[0];
             System.out.println(result2);

//    iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
             
             // See 1b ii. 

//    c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
             
             System.out.println("\nQuestion 1c:" );
             
             int sum1 = 0;
             double agesAverage = 0;
             for ( int index1 : ages) {
               sum1 += index1;
               agesAverage = sum1/ages.length; 
             } System.out.println("The average of the array ages is: " + agesAverage); // Average of ages array.
             
             int sum2 = 0;
             double ages2Average = 0;
             for ( int index2 : ages2) {
               sum2 += index2;
               ages2Average = sum2/ages2.length; 
             } System.out.println("The average of the array ages2 is: " + ages2Average); // Average of ages2 array.
             
             
             double averageOfBothArrays = ((sum1 + sum2) / (ages.length +ages2.length));
             System.out.println("The average age of both array is: " + averageOfBothArrays); //Average age of both arrays.
             
            
//    2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
             
             System.out.println("\nQuestion 2:" );
             
             String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
             
             for (int i = 0; i < names.length; i++) {   //Lists all the elements of the array
               System.out.println(names[i]);
                } 
             
             
//    a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
             
             System.out.println("\nQuestion 2a:" );
             
             int totalLettersInArray = 0;
             double averageLettersPerName = 0;
             for (String name : names) {
               totalLettersInArray += name.length();
               averageLettersPerName = totalLettersInArray /names.length;
             } System.out.println("Total number letters in the array: " + totalLettersInArray);  // Total number of letters in the array.
               System.out.println("Average number of letters per name: " + averageLettersPerName); // Average number of letters in the array.
               
//    b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
               
               System.out.println("\nQuestion 2b:" );
               
               String newNames = "";
               for (String name : names) {
                 newNames += name + " ";
                 } System.out.println(newNames); // All the elements of the names array concatenated together and separated by spaces. 
             
//    3. How do you access the last element of any array?
                 
                System.out.println("\nQuestion 3:" );                
                 
       // Last element of the array can be access by:
       // Let's say the given array is of length 9 and let's call it array . Last element of the array can be accessed by using System.out.println(array[array.length -1])
                
          //Lets look at the example from Question 2, where we have array of string with different names. The last element of the names array is "Bob".
                  System.out.println(names[names.length -1 ]); // Accessed the last element of the names array.              
               
//    4. How do you access the first element of any array?
               
               System.out.println("\nQuestion 4:" );  
          
         // Last element of the array can be access by:
         // Let's say the given array is of length 9 and let's call it array . Last element of the array can be accessed by using System.out.println(array[0]
         // System.out.println(array[0] will access/print out the first element of the array. The first element of the array is indexed at 0.
                         
             //Lets look at the example from Question 2, where we have array of string with different names. The last element of the names array is "Bob".
                 System.out.println(names[0]); // Accessed the last element of the names array.                        

//    5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
             
          System.out.println("\nQuestion 5:" );
             
                int[] nameLengths = new int[6];
          
                  for (int i = 0; i < names.length; i++) {
                     nameLengths[i] = names[i].length();
                   //  System.out.println(nameLengths[i]); 
                    //  System.out.println(names[i] + " " + nameLengths[i] );
                     }        
                  
                  for (int nameLength : nameLengths) {
                    System.out.println(nameLength); // Lists the elements of the nameLengths array.
                  }
                  
                  
//    6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
                  
           System.out.println("\nQuestion 6:" );     
           
             int sumOfNameLength = 0;
           
               for (int i =0; i < nameLengths.length ; i++ ) {
                 sumOfNameLength += nameLengths[i];
               } System.out.println("The sum of all elements in the array: " + sumOfNameLength); // The sum of all the elements is calculate here. 
           
           

//    7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

               System.out.println("\nQuestion 7:" );
               
               String a = "Hello";
               int b = 3;
               System.out.println(returnWord(a, b)); //Method returnWord takes string Hello and concatenated to itself the given n number of times.
               
//    8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
               
               System.out.println("\nQuestion 8:" );  
               
               fullName("Rahul","Shah"); // used public static void, since we did not need anything returned from this method. 

//    9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
               
               System.out.println("\nQuestion 9:" );
               
               int [] numbers1 = {5, 8, 11, 6, 15, 48, 26}; // Declared an array of integers, called the array numbers. 
              
               System.out.println(isSumGreaterThan100(numbers1)); //In this case the sum of the array above is greater than 100 so it returns true.
               
               int [] numbers2 = {4, 3, 2, 7, 9};  //Declared another array of integers, called the array numbers2.
               
               System.out.println(isSumGreaterThan100(numbers2)); //In this case the sum of the array above is less than 100 so it returns false.

//    10. Write a method that takes an array of double and returns the average of all the elements in the array.
               
               System.out.println("\nQuestion 10:" );
               
               double [] array = {2.15, 3.78, 4.66, 8.23, 10.58}; //Declared an array of doubles, called it array.
               
               System.out.println(averageOfElements(array)); //This prints the average of elements of an array of doubles using the method shows below on Method for question 10.

//    11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
               
               System.out.println("\nQuestion 11:" );
               
         double [] array1 = {10.5, 22.3, 7.8, 4.5, 12.1}; // Declared the first array of doubles, array1 
         double [] array2 = {5.5, 6.5, 20.2, 11.0, 5.3};  // Declared the second array of doubles, array2
               
         System.out.println(greaterAverage(array1, array2)); //Used the method shown below is method for question 11, to calculate the average of each arrays.
                                                             //  and return true if average of array 1 is greater that the average of array 2.

//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
         
              System.out.println("\nQuestion 12:" );         
                                
         boolean isHotOutside = true;
                    
         System.out.println(willBuyDrink(isHotOutside, 12)); //Used the method shown below is method for question 12.
                    
        //Lets try different amount of moneyInPocket. It should return false if the moneyInPocket is less that 10.50.
                    
         System.out.println(willBuyDrink(isHotOutside, 5)); // Returns false since the moneyInPocket is less that 10.50.                   

//    13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
               
         System.out.println("\nQuestion 13:" );
         
         //Takes 2 user input numbers and returns the sum and product of those numbers 
         
         Scanner sc = new Scanner(System.in);
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
                    
          System.out.println("Sum of your numbers: " + sum(num1, num2)); 
          System.out.println("Product of your numbers: " + product(num1, num2));
                   
                    
    }
    
 
  // Method for Question 7:
  
  public static String returnWord(String word, int n) {
    String result = "";
    for (int i = 1; i <= n; i ++) {
      result += word;
    }
    return result; 
  }
  
//Method for Question 8:
  
  public static void fullName(String firstName, String lastName) {
    System.out.println(firstName + " " + lastName);
  }
  
  
//Method for Question 9:
  
public static boolean isSumGreaterThan100(int[] numbers) {
   int sum = 0;
   for (int number : numbers) {
     sum += number;
   } return sum > 100;
}
  
//Method for Question 10:  

public static double averageOfElements(double[] array) {
  double sumOfArray = 0;
    for (double number : array) {
      sumOfArray += number;
    } return sumOfArray/array.length;
  
}
  
//Method for Question 11: 

public static boolean greaterAverage(double[] array1, double[] array2) {
  double sumOfArray1 = 0;
  double averageOfArray1 = 0;
  for (double number1 : array1) {
    sumOfArray1 += number1;
    averageOfArray1 = sumOfArray1/array1.length;
  }
  double sumOfArray2 = 0;
  double averageOfArray2 = 0;
  for(double number2 : array2) {
    sumOfArray2 += number2;
    averageOfArray2 = sumOfArray2/array2.length;
   } 
  return averageOfArray1 > averageOfArray2;
}

//Method for Question 12

public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
  if (isHotOutside == true && moneyInPocket > 10.50) {
    return true;
  } return false;
       }
  
//Method for Question 13

// This method takes user input of 2 integers and returns the sum and product of the two numbers.

public static int sum(int a, int b) {
   int sum = a + b;
    return sum;
}

public static int product(int a, int b) {
  int product = a * b;
   return product;
}
  
}
  
  
  


