package com.projects.observerPattern;


public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyOvservers();

}
