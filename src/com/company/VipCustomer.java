package com.company;

public class VipCustomer {

    String customerName;
    int customerCreditLimit;
    String customerEmailAddress;

    public VipCustomer() {
        this("DefaultName", 100000, "Default@email.com");
        System.out.println("empty Called");
    }

    public VipCustomer(String customerName, String customerEmailAddress) {
        this(customerName, 100000, customerEmailAddress);
        System.out.println("2 params called");
    }

    public VipCustomer(String customerName, int customerCreditLimit, String customerEmailAddress) {
        System.out.println("all three params called.");
        this.customerName = customerName;
        this.customerCreditLimit = customerCreditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public int getCustomerCreditLimit() {
        System.out.println(this.customerCreditLimit);
        return this.customerCreditLimit;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }
}
