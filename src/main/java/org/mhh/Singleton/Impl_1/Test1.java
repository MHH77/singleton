package org.mhh.Singleton.Impl_1;

public class Test1 {
    private Test1() {
    }

    private static final Test1 instance = new Test1();

    public static Test1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Test1.getInstance());
    }

}
