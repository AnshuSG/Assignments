package src.Assignments;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int fact = 1 ;
        if(number == 0)
        {
            System.out.println("Factorial of 0 is :" + 0);
        }
        else
        {
            for(int i=number;i>=1 ;i--)
            {
                fact = fact * i ;
            }
            System.out.println("Factorial of a" + number + "is :" + fact);
        }



    }

}
