import java.util.Scanner;

public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
    public static long factorial(int n){
        return factorial(n,1);
    }
    private static long factorial(int n, int result){
        if(n==0)
            return result;
        else
            return factorial(n-1, n*result);
    }
}
