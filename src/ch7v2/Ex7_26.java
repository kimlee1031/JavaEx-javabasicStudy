package ch7v2;

public class Ex7_26 {
    public static void main(String[] args) {
        Outer1.Inner ii = new Outer1.Inner();
        System.out.println(ii.iv);

    }
}

class Outer1 {
    static class Inner {
        int iv = 200;
    }
}
