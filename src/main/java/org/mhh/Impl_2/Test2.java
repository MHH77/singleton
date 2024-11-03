package org.mhh.Impl_2;

public class Test2 {
    private Test2() {
    }

    private static Test2 instance;

    public static Test2 getInstance() {
        if (instance == null) {
            instance = new Test2();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Test2.getInstance());

    }

}
