package ch3;

public class Ex3_2 {
    public static void main(String[] args) {
        int numOfApples = 120;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);

        System.out.println(numOfBucket);
    }
}
