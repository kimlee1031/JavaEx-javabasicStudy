package ch7v2;

public class Ex7_25 {
    public static void main(String[] args) {
        Outer o = new Outer();

        Outer.Inner ii = o.new Inner();
        System.out.println(ii.iv);


    }
}

class Outer {
    class Inner {
        int iv = 100;

    }
}

/*
* 내부 클래스(인스턴스 클래스)의 인스턴스를 생성하기 위해서는 먼저 외부 클래스의 인스턴스를 생성해야 한다. 왜냐하면
* '인스턴스 클래스' 는 외부 클래스의 '인스턴스 변수 ' 처럼 외부 클래스의 인스턴스가 생성되어야 쓸 수 있기 때문이다.
* */