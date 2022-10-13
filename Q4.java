//Write a function that takes in the radius as input and returns the circumference of a circle

import java.util.Scanner;
public class Q4 {
    public static double circumference(double r){
        return r*2*3.14156;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of a circle to calculate the circumference: ");
        double radius = input.nextDouble();

        System.out.println("The circumference of the circle is "+circumference(radius));
    }
}
