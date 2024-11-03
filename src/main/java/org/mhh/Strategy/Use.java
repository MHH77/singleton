package org.mhh.Strategy;

public class Use {
    public static void main(String[] args) {
        Strategy strategyA=new StrategyA();
        Strategy strategyB=new StrategyB();

        Context contextA = new Context(strategyA);
        contextA.runStrategy();

        Context contextB = new Context(strategyB);
        contextB.runStrategy();
    }
}
