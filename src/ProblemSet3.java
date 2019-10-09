/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
        
        // comment out or uncomment as needed
        
        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
        System.out.print("\nEnter an integer: ");
        int whatSign = in.nextInt();
        if (whatSign > 0) {
            System.out.print("\nPositive.\n");
        } else if(whatSign == 0) {
            System.out.print("\nZero.\n");
        } else {
            System.out.print("\nNegative.\n");
        }
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {
        System.out.print("\nEnter an integer: ");
        int evenOrOdd = in.nextInt();

        if (evenOrOdd % 2 == 0) {
            System.out.print("\nEven.\n");
        } else {
            System.out.print("\nOdd.\n");
        }
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter three integers. How are the integers ordered?
     */
    
    public void ordered() {
        System.out.println("\nEnter three integers.\n");

        System.out.print("Enter integer: ");
        int int1 = in.nextInt();
        System.out.print("Enter integer: ");
        int int2 = in.nextInt();
        System.out.print("Enter integer: ");
        int int3 = in.nextInt();

        
        if (int1 == int2 && int2 == int3){
            System.out.print("\nSame.\n\n");
        }else if (int1 > int2 && int2 > int3) {
            System.out.print("\nStrictly decreasing.\n\n");
        } else if ((int1 >= int2 && int2 >= int3 )) {
            System.out.print("\nDecreasing.\n\n");
        } else if (int1 < int2 && int2 < int3) {
            System.out.print("\nStrictly increasing.\n\n");
        } else if (int1 <= int2 && int2 <= int3) {
            System.out.print("\nIncreasing.\n\n");
        } else {
            System.out.print("\nUnordered.\n\n");
        }
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */
    
    public void gpa() {
        System.out.print("Enter a letter grade: ");
        String grade = in.next().toLowerCase();
        String letter = String.valueOf(grade.charAt(0));
        String additive = "";
        double gpaVar = 0.00;
        try {
            additive = String.valueOf(grade.charAt(1));
        } catch (Exception e) {
            
        }
        

        switch (letter) {
            case "a":
                gpaVar = 4;
                break;
            case "b":
                gpaVar = 3;
                break;
            case "c":
                gpaVar = 2;
                break;
            case "d":
                gpaVar = 1;
                break;
            case "f":
                gpaVar = 0;
                break;
            default:
                break;
        }

        switch (additive) {
            case "+":
                gpaVar += 0.33;
                break;
            default:
                break;
        }
        System.out.printf("\nYour GPA is %.2f.\n\n", gpaVar);
        
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {
        final int A_MIN = 90;
        final int B_MIN = 80;
        final int C_MIN = 70;
        final int D_MIN = 0;

        System.out.print("Enter a grade: ");
        double gradeNum = in.nextDouble(); 
        
        String letterGrade;
        
        if (gradeNum >= A_MIN) {
            letterGrade = "A";
        } else if (gradeNum < A_MIN && gradeNum >= B_MIN) {
            letterGrade = "B";
        } else if (gradeNum < B_MIN && gradeNum >= C_MIN) {
            letterGrade = "C";
        } else if (gradeNum < C_MIN && gradeNum >= D_MIN) {
            letterGrade = "D";
        } else if (gradeNum < D_MIN && gradeNum >= F_MIN) {
            letterGrade = "F";
        } else {
            System.out.println("That is not a valid score.");
            return;
        }
        System.out.printf("\nYou recieved a %S.\n\n", letterGrade);
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a playing card. What card was entered?
     */
    
    public void cards() {
        System.out.print("Enter a card: ");
        String card = in.next();
        String rank = String.valueOf(card.charAt(0)).toUpperCase();
        String suit = String.valueOf(card.charAt(1)).toUpperCase();

        switch (rank) {
            case "A":
                rank = "Ace";
                break;
            case "2":
                rank = "Two";
                break;
            case "3":
                rank = "Three";
                break;
            case "4":
                rank = "Four";
                break;
            case "5":
                rank = "Five";
                break;
            case "6":
                rank = "Six";
                break;
            case "7":
                rank = "Seven";
                break;
            case "8":
                rank = "Eight";
                break;
            case "9":
                rank = "Nine";
                break;
            case "T":
                rank = "Ten";
                break;
            case "J":
                rank = "Jack";
                break;
            case "Q":
                rank = "Queen";
                break;
            case "K":
                rank = "King";
                break;
            default:
                System.out.println("\nThat's not a valid rank.\n");
        }        
        switch (suit) {
            case "S":
                suit = "Spades";
                break;
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
        
            default:
                System.out.println("\nThat's not a valid suit.\n");
                return;
        }

        System.out.printf("\n%s of %s.\n\n", rank, suit);

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("\n%d is a leap year.\n\n", year);
        } else {
            System.out.printf("\n%d is not a leap year.\n\n", year);
        }
    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */
    
    public void state() {
        System.out.print("Enter a temperature: ");
        double temp = in.nextDouble();
        System.out.print("Enter a scale: ");
        char scale = in.next();
        
        
        
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {

    }
}