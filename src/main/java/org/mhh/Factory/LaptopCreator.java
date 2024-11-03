package org.mhh.Factory;

public class LaptopCreator extends Creator {

    @Override
    public Computer computerFactoryMethod() {
       return new Laptop();
    }
}
