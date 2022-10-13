//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered

import java.util.Scanner;
public class Q7 {
    
    public static void count(int n){
        Scanner input = new Scanner(System.in);
        int positive=0, negative=0, zeros = 0, number;
        for(int i=0; i<n; i++){
            number = input.nextInt();
            if(number == 0)
                zeros++;
            else if(number > 0)
                positive++;
            else
                negative++;
            
        }
        System.out.println("Total number of Positive number "+positive);
        System.out.println("Total number of Negative number "+negative);
        System.out.println("Total number of Zeros "+zeros);
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many number you want to enter: ");
        int n = input.nextInt();
        count(n);
    }
    
}
