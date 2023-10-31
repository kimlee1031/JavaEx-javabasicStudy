package ch12v2;

public class DectTestv {
    public static void main(String[] args) {
        Deckv d = new Deckv();
        Cardv c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }

}


class Deckv {
    final int CARD_NUM = Cardv.Kind.values().length * Cardv.Number.values().length;
    Cardv cardArr[] = new Cardv[CARD_NUM];

    Deckv() {
        int i = 0;
        for (Cardv.Kind kind : Cardv.Kind.values()) {
            for (Cardv.Number number : Cardv.Number.values()) {
                cardArr[i++] = new Cardv((kind), number);
            }
        }


    }

    Cardv pick(int index) {
        return cardArr[index];
    }

    Cardv pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Cardv temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}


class Cardv {
    enum Kind{CLOVER,HEART,DIAMOND, SPADE}
    enum Number {
        ACE,TWO,THREE,FOUR,FIVE,
        SIX,SEVEN,EIGHT,NINE,THE,JACK,QUEEN,KING4
    }

    Kind kind;
    Number num;

    Cardv() {
        this(Kind.SPADE, Number.ACE);
    }

    Cardv(Kind kind, Number num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return "[" + kind.name() + "," + num.name() + "]";
    }

}