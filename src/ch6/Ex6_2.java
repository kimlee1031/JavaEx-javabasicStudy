package ch6;

import java.sql.SQLOutput;

public class Ex6_2 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }


    static class SutdaCard {
        int num;
        boolean is;

        SutdaCard(int num, boolean is) {
            this.num = num;
            this.is = is;
        }

        SutdaCard() {
            this(1, true);
        }

        String info() {
            return num + (is ? "k" : "");
        }

    }


}
