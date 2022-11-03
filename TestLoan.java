import java.util.Scanner;
public class TestLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example: 8.25: ");

        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example 1200000.95: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was created on %.20s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",loan.getLoanDate().toString(),loan.getMonthlyPayment(),loan.getTotalPayment());
    }
}

class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    //No-arg constructor
    public Loan(){
        this(2.5,1,1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public java.util.Date getLoanDate(){
        return loanDate;
    }

}
