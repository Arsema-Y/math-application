package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        //Q-1
        //Determining the highest salary using Math.max
        double bobSalary = 65000;
        double garySalary = 67000;
        double highestSalary = Math.max(bobSalary, garySalary);
        //display result
        System.out.println("The highest salary is: " + highestSalary);

        //Q-2
        //Determining the lowest price using Math.min
        double carPrice = 34999.89;
        double truckPrice = 41999.99;
        double lowestPrice = Math.min(carPrice, truckPrice);
        //display result
        System.out.println("The lowest price is: " + lowestPrice);


    }
}
