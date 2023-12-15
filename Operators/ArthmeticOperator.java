package Operators;

import java.util.Scanner;

public class ArthmeticOperator {
    public static void main(String[] args) {
        // Arthmetic Operator
        // +, * , /, % ,-
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = a + b;
        // System.out.println("Ans = " + c);

        // Assignment Operator----> (=)
        // +=, -=,*=,/=,%=

        int c = 4;
        int d = 7;
        System.out.println(c += d);
        System.out.println(c -= d);
        System.out.println(c *= d);
        System.out.println(c /= d);
        System.out.println(c %= d);

        // Output

        /*
         * 11
         * 4
         * 28
         * 4
         * 4
         */

        // Relational Operator
        int firstNumber = 12;
        int secondNumber = 16;
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
        System.out.println(firstNumber > secondNumber);
        System.out.println(firstNumber < secondNumber);

        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        // output

        /*
         * false
         * true
         * false
         * true
         * false
         * true
         */

        // Logical Operator
        // &&, ||,!

    }
}
