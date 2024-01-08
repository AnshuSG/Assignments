package src.Assignments;

import java.util.Scanner;

public class FahrenheittoCelsius {

    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature");
        a= sc.nextDouble();
        System.out.println("Celsius temperature is :" + Celsius(a));
    }

    static double Celsius(double f)
    {
        return (f-32)*5/9;
    }

}
