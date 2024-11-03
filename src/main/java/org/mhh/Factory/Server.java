package org.mhh.Factory;

public class Server implements Computer {

    @Override
    public void create() {
        System.out.println("server create");
    }
}
