package java_lab;

import java.util.Scanner;

public class Summation_of_a_series {

    //write a program (Summation of a series) Write a program that displays the result of 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("how many number in series :");
        n = input.nextInt();
        int sum = (n * n + n) / 2;
        System.out.println("Summation of a seriess :" + sum);
    }

}
