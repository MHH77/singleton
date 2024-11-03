package org.mhh.Observer;

public class Use {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observerOne=new ObserverTypeOne();
        Observer observerTwo=new ObserverTypeTwo();
        subject.addObserver(observerOne);
        subject.addObserver(observerTwo);

        subject.notifyObservers();

        subject.detachObserver(observerOne);
        subject.notifyObservers();


    }
}
