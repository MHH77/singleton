package org.mhh.Decorator;

public class Use {
    public static void main(String[] args) {

        Component component = new BaseComponent();
        Component decoratorA = new DecoratorA(component);
        Component decoratorB = new DecoratorB(component);

        decoratorA.operation();



    }

}
