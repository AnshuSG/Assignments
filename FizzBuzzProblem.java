package src.Assignments;



public class FizzBuzzProblem {

    //program that prints numbers from 1 to 100. For multiples of 3, print "Fizz" instead of the number, and for the multiples of 5, print "Buzz". For numbers which are multiples of both 3 and 5, print "FizzBuzz".
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++)
        {

            if ((i%3==0) && (i%5==0))
            {
                System.out.println("Value of " + i + " is" + ": " + "FizzBuzz");
            }
            else if (i%3==0)
            {
                System.out.println( "Value of " + i + " is" + ": " + "Fizz");
            }
            else if (i%5==0)
            {
                System.out.println("Value of " + i + " is" + ": " + "Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
