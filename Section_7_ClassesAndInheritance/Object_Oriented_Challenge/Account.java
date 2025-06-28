/*
Object Oriented Challenge

Create a new class for a bank account.
Create fields for account characteristics like:
account number.
account balance.
customer name.
email.
phone number.

Create getters and setters for each field.
Create two additional methods:
one for depositing funds into the account.
one for withdrawing funds from the account.

A customer should not be allowed to withdraw funds if that withdrawal takes their balance negative.
Create a new project called ClassesChallenge with the usual Main class with the usual main method.   
You'll create an instance of an Account class and then test your withdraw and deposit methods.
You'll print information to the console that confirms what the balance is after the methods are called.

You want to make this class encapsulated, so you'll make all your fields private and set up getter and setter methods for your fields.
In addition, you'll have two behavioral methods. One for depositing funds, the other for withdrawing funds.
In addition to this class, you'll set up a main class with a main method that creates at least one instance of the bank account class and simulates depositing and withdrawing money from the account.

*/
package Section_7_ClassesAndInheritance.Object_Oriented_Challenge;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {

        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance);
        }
    }
}
