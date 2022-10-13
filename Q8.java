//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power another. ie a^n

import java.util.Scanner;
public class Q8 {
    public static long power(int x, int n){
        int result= 1;
        for(int i=1; i<=n; i++)
            result*=x;
        return result;

    
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x and n to calculate x^n : ");
        int x = input.nextInt();
        int n = input.nextInt();
        System.out.println(x+"^"+n+" is "+power(x,n));
    }
    
}
