package org.mhh.Singleton.Impl_3;

public class Test3 {
    private Test3() {
    }

    private static Test3 instance;

    public synchronized static Test3 getInstance() {
        if (instance == null) {
            instance = new Test3();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Test3.getInstance());

    }

}
