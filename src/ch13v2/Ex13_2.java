package ch13v2;

public class Ex13_2 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread3());

        th1.run();

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}


class Thread3 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
}
