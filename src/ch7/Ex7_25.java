package ch7;

public class Ex7_25 {
    public static void main(String[] args) {
        Outer n = new Outer();
        Outer.Inner ii = n.new Inner();
        System.out.println(ii.iv);
    }
}


class Outer {
    class Inner {
        int iv =100;
    }
}
