//Enter 3 numbers from the user and make a function to print their average

import java.util.Scanner;
public class Q1{

    public static float average(float x, float y, float z){
        return (x+y+z)/3;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 3 numbers to ger their average: ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        System.out.println("Average of "+a+", "+b+", "+c+" is "+average(a,b,c));
    }
}