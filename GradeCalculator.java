package src.Assignments;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter average of marks below 100");
        int avg = sc.nextInt();
        char grade = 0;

        if(avg >=90 && avg <= 100)
        {
            grade = 'A';
        }
    else if (avg >= 60 && avg < 90)
        {
            grade = 'B';
        }
    else if (avg >= 40 && avg < 60)
        {
            grade = 'C';
        }
    else if( avg >= 30 && avg <40)
        {
            grade = 'D';
        }
        else if( avg < 30)
        {
            grade = 'F';
        }

     switch (grade) {

            case 'A':
            System.out.println("Excellent");
            break;
            case 'B':
            System.out.println("Good");
            break;
            case 'C':
            System.out.println("Well done");
            break;
            case 'D':
            System.out.println("You Passed");
            break;
            case 'F':
            System.out.println("Better Try Again");
            break;
            default:
                System.out.println("Invalid Grade");
        }

        System.out.println("Your grade is :" + grade);






    }
}
