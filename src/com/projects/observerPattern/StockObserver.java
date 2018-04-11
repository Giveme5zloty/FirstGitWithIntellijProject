package com.projects.observerPattern;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker =0;

    private int observerID;

    private Subject subject;

    public StockObserver(Subject subject) {
        this.subject = subject;
        this.observerID = observerIDTracker++;
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
    }

    public void printThePrices(){
        System.out.println(this.observerID + "\nIBM: " + this.ibmPrice +
        "\nAAPL: " + this.ibmPrice + "\nGOOG: " + this.googPrice +"\n");
    }
}
