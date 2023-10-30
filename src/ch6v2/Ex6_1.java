package ch6v2;

public class Ex6_1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }

}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard() {
        this(1, true);
    }

    String info() {
        return num + (isKwang ? "K" : "");

        /*if (isKwang == true) {
            return num + "k";
        } else {
            return String.valueOf(num);
        }*/

    }
}
