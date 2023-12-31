package src.Assignments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        /*for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n" , num, i , num * i)  ;
        }
       */
       int i=1;
        while (i<= 10)
        {
            System.out.printf("%d * %d = %d \n" , num, i , num * i);
            i++;
        }

    }
}
