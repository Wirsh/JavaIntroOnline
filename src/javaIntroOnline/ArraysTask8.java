package javaIntroOnline;

public class ArraysTask8 {
    public static void main(String[] args) {
        int[] a = new int[11];
        int min = 0;
        int count = 0;
        for (int i = 0; i < 11; i++) {
            a[i] = (int) (Math.random() * 10);
            if (a[i] >= min) {
                min = a[i];
                count++;
                System.out.println(a[i]);
            }
        }//
        for (int i = 0; i < 11; i++) {
            if (a[i] < min) {
                min = a[i];
                count++;
            }
            System.out.println(min + " " + count);
        }


    }
}
