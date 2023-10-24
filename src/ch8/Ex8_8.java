package ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex8_8 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int intput = 0;
        int count = 0;

        do {
            System.out.println("1과 100사이의 값을 입력하세요");

            try {
                intput = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 값을 입력하였습니다. 숫자를 다시 입력해 주세요");

                continue;
            }
            count++;
            if (answer > intput) {
                System.out.println("더 큰 수를 입력하세요 :");
            } else if (answer < intput) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도 횟수는" + count + "번 입니다.");
                break;
            }
        } while (true);
    }
}

