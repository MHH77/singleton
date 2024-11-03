package org.mhh.Observer;

public class ObserverTypeTwo implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverTypeTwo is updated");
    }
}
