package ch7v2;

public class Product1 {

    Product1() {
    }
    int price;
    int bonusPoint;

    Product1(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product1 {
    Tv1() {
    }

    public String toString() {
        return "Tv";
    }

}

class Ex7_5 {
    public static void main(String[] args) {
        Tv1 t = new Tv1();
        System.out.println(t.toString());
    }
}