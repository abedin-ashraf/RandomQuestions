import java.util.Scanner;
public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the values of a,b,c for the roots of quadratic function ax^2+bx+c=0 : ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        QuadraticEquation quadric = new QuadraticEquation(a,b,c);

        System.out.println(quadric.getDiscriment());
        System.out.println(quadric.getRoot1());
        System.out.println(quadric.getRoot2());

    }
}
class QuadraticEquation{
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public double getDiscriment(){
        return Math.sqrt((b*b)-4*a*c);
    }
    public double getRoot1(){
        double root1 = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);
        return root1;
    }
    public double getRoot2(){
        double root2 = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);
        return root2;
    }
}