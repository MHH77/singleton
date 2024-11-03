package org.mhh.Factory;

public class Laptop implements Computer {

    @Override
    public void create() {
        System.out.println("Laptop created");
    }
}
