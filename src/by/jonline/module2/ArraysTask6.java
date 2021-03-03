package by.jonline.module2;

public class ArraysTask6 {
    public static void main(String[] args) {

        int[] k = new int[20];
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            k[i] = (int) (Math.random() * 20 - 10);
        }
        for (int i = 0; i < 20; i++) {
            if (isPrime(i)) {
                sum += k[i];
            }
        }
        System.out.println("The sum of prime-index elements is equal "+sum);
    }
    public static boolean isPrime(int number) {
        if((double) number <2){return false;}
        double sq = Math.abs(Math.sqrt(number));
        for (int i = 2; i <= sq; i++)
            if ((double) number % i == 0) {
                return false;
            }
        return true;
    }
}
