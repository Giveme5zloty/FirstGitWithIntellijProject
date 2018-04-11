package com.projects;


import com.projects.observerPattern.StockGrabber;
import com.projects.observerPattern.StockObserver;

public class Main {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);


        stockGrabber.setAaplPrice(123);
        stockGrabber.setIbmPrice(152);
        stockGrabber.setGoogPrice(245);



    }

}
