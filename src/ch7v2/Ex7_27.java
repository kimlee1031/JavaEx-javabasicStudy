package ch7v2;

public class Ex7_27 {
    public static void main(String[] args) {
        Outer2 o = new Outer2();
        Outer2.Inner ii = o.new Inner();

        ii.method1();
    }

}

class Outer2 {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer2.this.value);

        }
    }
}

