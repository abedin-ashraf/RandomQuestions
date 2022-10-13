//Write a function that takes in age as input and return if that person is eligible to vote or not. A person aof age > 18 is eligible to vote.

import java.util.Scanner;
public class Q5 {
    public static void voterCalculator(int age){
        if(age>18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote right now.");
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age to see if you can vote or not: ");
        int age = input.nextInt();
        voterCalculator(age);
    }
}
