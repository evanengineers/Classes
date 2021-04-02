package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public BankAccount() {
        this(56789,50.00, "Default Name", "thatemail@fmail.com", "1546784");
        System.out.println("Empty constructor called");
        //This is now calling the other constructor with parameters is this empty one is used.
        //So if we create an instances of this class and use this constructor with an empty contructor, it will then us the constructor below and add the default params above.
        //This is not necessary but can be used if say for instance you want to make sure that the object created also has all(or cetain) the fields set upon creation.
        //See below example where we only set 2 defaults (balance and accountNumber).
    }

    public BankAccount(String customerName, String customerEmail, String phoneNumber) {
        this(99999, 100.00, customerName, customerEmail, phoneNumber); //Its not this + "."
        //Only the "this" word is needed plus params.
    }

    public BankAccount(int accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }




    public int getAccountNumber() {
        System.out.println("Account Number is " + this.accountNumber);
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        System.out.println("Current Balance is " + this.balance);
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        System.out.println("Customer's name is " + this.customerName);
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        System.out.println("Customer's email is " + this.customerEmail);
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds(double amount) {

        double newBalance = this.balance += amount;
        System.out.println("Amount deposited = $" + amount);
        System.out.println("New balance = " + newBalance);
        return newBalance;
    }

    public double withdrawFunds(double amount) {

        if (this.balance - amount < 0) {
            System.out.println("Insufficient funds");
            return -1;
        }
        double newBalance = this.balance -= amount;
        System.out.println("New balance = " + newBalance);
        return newBalance;
    }
}
