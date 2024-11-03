package org.mhh.Observer;

public class ObserverTypeOne implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverTypeOne is updated");
    }
}
