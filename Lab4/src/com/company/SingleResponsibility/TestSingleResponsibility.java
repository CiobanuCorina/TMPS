package com.company.SingleResponsibility;

public class TestSingleResponsibility {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(new Product("motor", "GX2351", 30, 300.99, 50));
        taxCalculator.calculateTotalPrice();
        System.out.println(taxCalculator.getTotalPrice());
    }
}
