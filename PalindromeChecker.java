package src.Assignments;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum= 0; int temp,rem;
        temp = num;
        while(num>0)
        {
            rem = num %10;
            sum = (sum *10) + rem;
            num = num /10;
        }
        if(temp == sum)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}
