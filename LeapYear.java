package src.Assignments;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = sc.nextInt();
        if(Year % 4==0)
        {
            System.out.println(" Year is Leap Year");
        }
        else
        {
            System.out.println(" Year is not Leap Year");
        }

    }

}
