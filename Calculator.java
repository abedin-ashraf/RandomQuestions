import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator = input.next().charAt(0);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double result = calc(operator, num1, num2);
        if(result == -1)
            System.out.println("Invalid input");
        else
            System.out.println("Result is "+ result);

    }
    public static double calc(char operator, double num1, double num2){
        if(operator == '+')
            return num1+num2;
        else if(operator == '-')
            return num1-num2;
        else if(operator == '*')
            return num1*num2;
        else if(operator == '/')
            return num1/num2;
        return -1;
    }
}
