package com.company;

public class Main {

    public static void main(String[] args) {

//        Car buick = new Car();
//        Car holden = new Car();
//        buick.setModel("s340");
//        holden.setModel("holden");
//
//        System.out.println(buick.getModel());

//        BankAccount EvansAccount = new BankAccount();
//        EvansAccount.setCustomerName("Evan Cottrell");
//        EvansAccount.setAccountNumber(123456789);
//        EvansAccount.getCustomerName();
//        EvansAccount.depositFunds(200.00);
//        EvansAccount.getBalance();
//        EvansAccount.withdrawFunds(50.00);
//        EvansAccount.withdrawFunds(151.00);

//        BankAccount charliesAccount = new BankAccount(123145, 0, "Charlie Odual", "codual@gmail.com", "293-888-9999");
//        charliesAccount.getBalance();
//
//        charliesAccount.depositFunds(100.0);
//        charliesAccount.withdrawFunds(45.00);

//        BankAccount JennysAccount = new BankAccount();

        VipCustomer EvansAccount = new VipCustomer();
        EvansAccount.getCustomerCreditLimit();

        VipCustomer EdensAccount = new VipCustomer("Eden", "Default@email.com");
        EdensAccount.getCustomerCreditLimit();

    }
}
