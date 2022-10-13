//Write a function to print the sum of all odd number from 1 to n

import java.util.Scanner;
public class Q2 {
    public static int SumOfAllOddNumber(int n){
        int sum = 0;
        for(int i=1; i<=n; i+=2){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number to calculate the sum of all odd numbers from 1 to n: ");
            int n = input.nextInt();
            System.out.println("Sum of all odd number from 1 t0 "+n+" is "+SumOfAllOddNumber(n));
        }
    }
}
