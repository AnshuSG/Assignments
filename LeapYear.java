package src.Assignments;

import java.util.Scanner;

  // divisible by 4, not by 100, or divisible by 400
public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = sc.nextInt();
        if((Year % 4 == 0) && (Year % 100 != 0 || Year % 400 == 0))
        {
            System.out.println(" Year is Leap Year");
        }
        else
        {
            System.out.println(" Year is not Leap Year");
        }

    }

}
