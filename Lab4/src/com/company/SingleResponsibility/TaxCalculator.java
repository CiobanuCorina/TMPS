package com.company.SingleResponsibility;

public class TaxCalculator {
    private double tva;
    private double transportExpenses;
    private double totalPrice;
    private Product product;

    public TaxCalculator(Product product) {
        this.product = product;
    }

    public void calculateTva() {
        this.tva = this.product.getPrice() * 0.1;
    }

    public void calculateTransportExpenses() {
        this.transportExpenses = this.product.getWeight() * 0.2;
    }

    public void calculateTotalPrice() {
        this.calculateTva();
        this.calculateTransportExpenses();
        this.totalPrice = this.tva + this.transportExpenses + this.product.getPrice();
    }

    public double getTva() {
        return tva;
    }

    public double getTransportExpenses() {
        return transportExpenses;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
