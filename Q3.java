//Write a function which takes 2 numbers and returns the greater of those two.

import java.util.Scanner;
public class Q3 {
    public static double comparison(double a, double b){
        return (a>b)?a:b;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers to do the comparison between them: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        System.out.println(comparison(x,y)+" is greater among "+x+" and "+y+"  .");
    }
}
