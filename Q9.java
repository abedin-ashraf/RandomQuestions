//Write a function that calculates the Greatest Common Divisor of two numbers.

import java.util.Scanner;
public class Q9 {
    public static int gcd(int a, int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number determine their GCD: ");

        int a = input.nextInt();
        int b = input.nextInt();

        if(a>0 && b>0){
            System.out.println("Greatest Common Divisor of "+a+" and "+b+" is "+gcd(a,b));
        }
        else
            System.out.println("Please enter numbers greater than zero");
        
    }
}
