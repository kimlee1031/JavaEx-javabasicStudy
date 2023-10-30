package ch6v2;

public class Ex6_20 {

    public static int[] shuffle(int[] original) {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                int tmp = original[i];
                original[i] = original[j];
                original[j] = tmp;
            }
        }
        return original;
    }
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));


    }
}
