package org.mhh.Impl_5;

public class Test5 {
    private static final long serialVersionUID = -7604766932017737115L;

    private Test5() {
    }

    private static class INNER {
        private static final Test5 INSTANCE = new Test5();
    }

    public static Test5 getInstance() {
        return INNER.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(Test5.getInstance());

    }

}
