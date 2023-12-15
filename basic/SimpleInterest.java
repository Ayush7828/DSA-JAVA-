package basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three Numbers = ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int ans = a + b + c;
        System.out.println("Answer " + ans);
        float average = ans / 3.0f;
        System.out.println("Average = " + average);
    }
}
