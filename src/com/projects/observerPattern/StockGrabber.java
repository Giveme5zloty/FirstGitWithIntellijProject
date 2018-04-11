package com.projects.observerPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer->observer.update(this.ibmPrice, this.aaplPrice, this.googPrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }
}
