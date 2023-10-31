package ch7v2.abstractclass;

public abstract class Animal {
    public String kind;

    public void breath() {
        System.out.println("숨 쉰다.");
    }

    public abstract void sound();//추상메서드, 구체적인 구현부는 없다.
}


