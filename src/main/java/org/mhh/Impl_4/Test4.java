package org.mhh.Impl_4;

public class Test4 {
    private Test4() {
    }

    private static class INNER {
        private static final Test4 INSTANCE = new Test4();
    }

    public static Test4 getInstance() {
        return Test4.INNER.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(Test4.getInstance());

    }

}
