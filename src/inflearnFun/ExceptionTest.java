package inflearnFun;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionObj1 ex = new ExceptionObj1();
        /*try {*/
            int value = ex.divide(10, 0);
            System.out.println(value);
        /*} catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println(e.toString());

        }*/

    }
}

class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;
        try {
            value = i / k;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println(e);
        }
        return value;
    }
}
