package ch6v2;

public class Ex6_23 {
    public static int max(int[] arr) {
        int maxNum=0;
        if (arr == null || arr.length ==0 ) {
            return -999999;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최댓값: "+ max(data));
        System.out.println("최댓값: "+ max(null ));
        System.out.println("최댓값: " + max(new int[]{}));
    }
}
