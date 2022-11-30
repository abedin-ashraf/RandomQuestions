

import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: $"+account.getBalance());
        System.out.println("Monthly Interest: $"+account.getMonthlyInterest());
        System.out.println("Account created: "+account.getDateCreated());

    }
}
class Account{
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated = new Date();
    public Account(){

    }
    public Account(int specificId, double initialBalance){
        id = specificId;
        balance = initialBalance;
    }
    //Accessor
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public String getDateCreated(){
        return dateCreated.toString();
    }
    //Mutator
    public void setId(int newId){
        id = newId;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*((annualInterestRate/100)/12);
    }
    public void withdraw(double ammount){
        balance -= ammount;
    }
    public void deposit(double ammount){
        balance += ammount;
    }
}