//Write a program to print the Fbonacci series of n terms where n is input by the user


import java.util.Scanner;
public class Q10 {
    public static void fibonacciNumberPrinter(int n){
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        for(int i = 0; i<=n-2; i++){
            
            temp = b;
            b = a+b;
            a = temp;
            System.out.print(b+"\t");
            
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a mumber to print the Fibonacci Series until n term: ");
        int n = input.nextInt();
        fibonacciNumberPrinter(n);
    }
}
