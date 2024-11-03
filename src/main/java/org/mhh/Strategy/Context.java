package org.mhh.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void runStrategy(){
        strategy.execute();
    }
}
