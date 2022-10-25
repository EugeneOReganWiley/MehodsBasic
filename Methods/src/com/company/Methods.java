package com.company;

import javax.swing.*;

public class Methods {
    public static void main(String[] args) {
        //Calling the simplest method / procedure (nothing passed in  or returned.

        addSimple(); // Branches from this point to addSimple() method

        String num1String, num2String;
         /*
        Using JOptionPane objects for data input rather
        than Scanner objects (Looks way better ;-)
         */
        num1String = JOptionPane.showInputDialog(null, "Input First Number");
        // Parsing String to an int for calculations
        int num1Number = Integer.parseInt(num1String);
        num2String = JOptionPane.showInputDialog(null, "Input Second Number");
        int num2Number = Integer.parseInt(num2String);
        /*
        2nd Method Invocation - Has 2 inputs but does NOT return a value
         */
        adderAndDontReturn(num1Number, num2Number);
        /*
        3rd Method Invocation - 2 inputs and returns an integer which
        is then used in main itself ... it is assigned to intReturned
         */
        int intReturned = adderAndReturn(num1Number, num2Number);
        System.out.println("The answer returned from the method  and printed in main is " + intReturned);
    } // End of main

    /**
     * This method does all the tasks associated with the addition calculation.
     * While not wrong, it is inadvisable to do so much in one method
     * (methods should have distinct and atomic actions).
     */
    public static void addSimple() {
        String num1String, num2String;
        num1String = JOptionPane.showInputDialog(null, "Input First Number");
        double num1Number = Double.parseDouble(num1String);
        num2String = JOptionPane.showInputDialog(null, "Input Second Number");
        double num2Number = Double.parseDouble(num2String);
        System.out.println("The answer is " + (num1Number + num2Number)+
                " and we do all this from within the relevant method");
    }

    /**
     * Second method takes in two values but does not return a value
     * There is no return value due to the keyword void in the method
     * signature
     * @param num1Number
     * @param num2Number
     */
    public static void adderAndDontReturn(int num1Number, int num2Number) {
        int answer = (num1Number + num2Number);
        System.out.println("=== Method with inputs but no return value ===");
        System.out.println("The answer is " + answer+ " and this is from within the method");

    }

    /**
     * This method takes in two values and returns an integer
     * Note while the parameters within the ()'s are distinctly named,
     * only the datatype, int, is only shown for the return type
     * @param num1Number
     * @param num2Number
     * @return
     */
    public static int adderAndReturn(int num1Number, int num2Number) {
        int answer = (num1Number + num2Number);
        System.out.println("=== Method with inputs and a return value ===");
        System.out.println("The answer is " + answer+ "which we will now return");
        return answer;
    }



} // End of class
