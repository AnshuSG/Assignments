package src.Assignments;

import java.util.Scanner;

public class LenSumReverseofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        int len = 0;
        int rem = 0;
        int rev = 0;

        while(num != 0 )
        {
            int temp = num;
            num = num/10;
            rem = temp%10;
            rev = (rev *10) + temp % 10;

            sum = sum + rem ;

            len++ ;
        }

        System.out.println("Length of a number is :" + len );
        System.out.println("Sum of digits in number is :"  + sum);
        System.out.println("Reverse of  digits in number is :"  + rev);
    }
}
