package org.mhh.Decorator;

public class BaseComponent implements Component {
    @Override
    public void operation() {
        System.out.println("BaseComponent operation");
    }
}
