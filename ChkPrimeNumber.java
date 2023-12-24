package src.Assignments;

import java.util.Scanner;

public class ChkPrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int temp = 0;
        if(number == 0 || number == 1)
        {
            System.out.println("Number is not a prime number");
        }
        else {

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    temp = 1;
                    break;
                }

            }

            if (temp == 1) {
                System.out.println("Number is not a prime number");
            } else {
                System.out.println("Number is prime number");
            }
        }
    }
}
