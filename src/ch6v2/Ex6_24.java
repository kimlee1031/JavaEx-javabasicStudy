package ch6v2;

import java.sql.SQLOutput;

public class Ex6_24 {
    public static int abs(int value) {
        return value >= 0 ? value : value * -1;
        /*if (value >= 0) {
            return value;
        } else {
            return value * -1;
        }*/
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절댓값" + abs(value));
        value = -10;
        System.out.println(value + "의 절댓값" + abs(value));
    }

}
