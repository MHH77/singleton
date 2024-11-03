package org.mhh.Decorator;

public class DecoratorB extends  Decorator {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("DecoratorB");
    }
}
