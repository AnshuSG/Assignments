package src.Assignments;

import java.util.Scanner;

public class Palindromefunction {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String User_input = sc.next();
        boolean isPalindromeres = isPalindrome(User_input);
        if (isPalindromeres) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }
         static boolean isPalindrome(String  userInput){
             String original_string = userInput;
             StringBuilder sb  = new StringBuilder(userInput);
             String reverseString = sb.reverse().toString();
             return original_string.equalsIgnoreCase(reverseString);





        }





    }


