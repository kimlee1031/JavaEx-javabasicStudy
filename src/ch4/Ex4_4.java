package ch4;

public class Ex4_4 {
    public static void main(String[] args) {

        int sum = 0;
        int s = 1;
        int num = 0;

        for (int i = 1; true; i++, s = -s) {
            sum = i * s;
            num += sum;

            if (num >= 100) {
                break;
            }
        }

        System.out.println("sum=" + sum);
        System.out.println("num=" + num);

    }
}
