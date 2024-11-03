package org.mhh.Factory;

public class Use {
    public static void main(String[] args) {
        Computer server=new Server();
        server.create();

        Computer laptop=new Laptop();
        laptop.create();
    }
}
