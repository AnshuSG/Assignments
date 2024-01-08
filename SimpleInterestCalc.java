package src.Assignments;

import java.util.Scanner;

public class SimpleInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Values for P ,T and R");
        double P = sc.nextDouble();
        double T = sc.nextDouble();
        double R = sc.nextDouble();
        double SI =  calcSimpleInterest(P,T,R);
        System.out.println("Simple Interest is :" + SI);
    }

    static double calcSimpleInterest(double p,double t, double r)
    {
        return (p*t*r)/100;
    }


}
