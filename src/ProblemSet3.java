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
        } else if (int1 > int2 && int2 > int3) {
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
        final int A_GPA = 4;
        final int B_GPA = 3;
        final int C_GPA = 2;
        final int D_GPA = 1;
        final int F_GPA = 0;
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
                gpaVar = (double) A_GPA;
                break;
            case "b":
                gpaVar = (double) B_GPA;
                break;
            case "c":
                gpaVar = (double) C_GPA;
                break;
            case "d":
                gpaVar = (double) D_GPA;
                break;
            case "f":
                gpaVar = (double) F_GPA;
                break;
            default:
                break;
        }
        if (gpaVar != 0 || gpaVar != 4) {
            switch (additive) {
                case "+":
                    gpaVar += (gpaVar != 4) ? 0.33: 0;
                    break;
                case "-":
                    gpaVar -= (gpaVar != 0) ? 0.33: 0;
                default:
                    break;
            }
        }
        System.out.printf("\nYour GPA is %.2f.\n\n", gpaVar);
        
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {
        final int A_MAX = 100;
        final int A_MIN = 90;
        final int B_MIN = 80;
        final int C_MIN = 70;
        final int D_MIN = 60;
        final int F_MIN = 0;

        System.out.print("Enter a grade: ");
        double gradeNum = in.nextDouble(); 
        
        String letterGrade = "";
        
        if (gradeNum >= A_MIN && gradeNum <= A_MAX) {
            letterGrade = "A";
        } else if (gradeNum < A_MIN && gradeNum >= B_MIN) {
            letterGrade = "B";
        } else if (gradeNum < B_MIN && gradeNum >= C_MIN) {
            letterGrade = "C";
        } else if (gradeNum < C_MIN && gradeNum >= D_MIN) {
            letterGrade = "D";
        } else if (gradeNum < D_MIN && gradeNum >= F_MIN) {
            letterGrade = "F";
        } else if (gradeNum > A_MAX) {
            System.out.println("\nGrades above 100 are invalid.\n");
            return;
        } else if (gradeNum < F_MIN) {
            System.out.println("\nGrades below 0 are invalid.\n");
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
        final int WATER_BOIL_C = 100;
        final int WATER_FREEZE_C = 0;
        final int WATER_BOIL_F = 212;
        final int WATER_FREEZE_F = 32;

        System.out.print("Enter a temperature: ");
        double temp = in.nextDouble();
        System.out.print("Enter a scale: ");
        String scale = in.next().toLowerCase();
        String output;
        if (scale.equals("f")) {
            if (temp >= WATER_BOIL_F) {
                output = "Gas.";
            } else if (temp < WATER_BOIL_F && temp > WATER_FREEZE_F) {
                output = "Liquid.";
            } else if (temp <= WATER_FREEZE_F) {
                output = "Solid.";
            } else {
                output = "Invalid temperature.";
            }
        } else if (scale.equals("c")) {
            if (temp >= WATER_BOIL_C) {
                output = "Gas.";
            } else if (temp < WATER_BOIL_C && temp > WATER_FREEZE_C) {
                output = "Liquid.";
            } else if (temp <= WATER_FREEZE_C) {
                output = "Solid.";
            } else {
                output = "Invalid temperature.";
            }
        } else {
            output = "Invalid scale.";
        }

        System.out.printf("\n%s\n\n", output);
        
        
        
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        
        final int MIN_LENGTH = 3;
        
        System.out.print("Enter a month: ");
        String month = in.next().toUpperCase();
        int inputLength = month.length();

        String jan = "JANUARY";
        String feb = "FEBRUARY";
        String mar = "MARCH";
        String apr = "APRIL";
        String may = "MAY";
        String jun = "JUNE";
        String jul = "JULY";
        String aug = "AUGUST";
        String sep = "SEPTEMBER";
        String oct = "OCTOBER";
        String nov = "NOVEMBER";
        String dec = "DECEMBER";
        String polyTail = "";

        for (int i = 0; i < inputLength; i++) {
            polyTail = polyTail + " ";
        }

        if (inputLength >= MIN_LENGTH) {
            if (month.equals((sep + polyTail).substring(0, inputLength)) || month.equals((apr + polyTail).substring(0, inputLength)) 
              || month.equals((jun + polyTail).substring(0, inputLength)) || month.equals((nov + polyTail).substring(0, inputLength))) {
                System.out.println("\n30 days.\n");
            } else if (month.equals((feb + polyTail).substring(0, inputLength))) {
                System.out.println("\n28 or 29 days.\n");
            } else if (month.equals((jan + polyTail).substring(0, inputLength)) || month.equals((mar + polyTail).substring(0, inputLength)) 
              || month.equals((may + polyTail).substring(0, inputLength)) || month.equals((jul + polyTail).substring(0, inputLength)) 
              || month.equals((aug + polyTail).substring(0, inputLength)) || month.equals((oct + polyTail).substring(0, inputLength)) 
              || month.equals((dec + polyTail).substring(0, inputLength))) {
                System.out.println("\n31 days.\n");
            } else {
                System.out.println("\nThat is not a valid month.\n");
            }
        } else {
            System.out.println("\nThat is not a valid month.\n");
        }

        
    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {
        final int NORMAL_HOURS = 40;
        final double OVRTME_MULT = 1.5;
        
        System.out.print("Wage: ");
        double wage = in.nextDouble();
        System.out.print("Hours: ");
        double hours = in.nextDouble();
        double money = 0;

        if (hours > NORMAL_HOURS) {
            hours = hours - NORMAL_HOURS;
            money = (double) NORMAL_HOURS * wage;
            money += hours * wage * OVRTME_MULT;
        } else {
            money = hours * wage;
        }

        System.out.printf("\nYou'll make $%,.2f this week.\n\n", money);
    }
}