package src.Assignments;

import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y:");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z:");
        double z = sc.nextDouble();
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("result is :" + result);

    }
}


