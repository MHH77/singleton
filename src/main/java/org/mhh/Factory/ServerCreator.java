package org.mhh.Factory;

public class ServerCreator extends Creator {

    @Override
    public Computer computerFactoryMethod() {
        return new Server();
    }
}
