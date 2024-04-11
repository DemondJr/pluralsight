package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary= 3400.00;
        double garySalary = 5600.00;
                double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("the highest salary is " + highestSalary);
        int carPrice= 1000;
        int truckPrice= 1100;
        int lowestPrice = Math.max(carPrice, truckPrice);
        System.out.println("the lowest price is" + lowestPrice );
        double radius= 7.25;
                double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);

    }