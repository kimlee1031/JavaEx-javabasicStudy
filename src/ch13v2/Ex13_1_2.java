package ch13v2;

public class Ex13_1_2 {

    public static void main(String[] args) {
        Thread th1 = new Thread(new Thread2());

        th1.start();
    }


}


class Thread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println('-');
        }
    }
}
