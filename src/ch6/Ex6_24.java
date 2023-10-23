package ch6;

public class Ex6_24 {
    public static int abs(int value) {
        return value >= 0 ? value : -value;
        //쉽고 코드가 적은 삼항연산자 쓰기.....
        /*if (value > 0) {
            return value;
        } return value * -1;*/
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + "의 절댓값: " + abs(value));
        value = -10;
        System.out.println(value + "의 절댓값: " + abs(value));
    }
}
