package org.mhh.Decorator;

public class DecoratorA extends  Decorator {
    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("DecoratorA");
    }
}
