package ch13;

public class E2 {
    public static void main(String[] args) {
        ThreadE e1 = new ThreadE();
        e1.start();
    }
}

class ThreadE extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
