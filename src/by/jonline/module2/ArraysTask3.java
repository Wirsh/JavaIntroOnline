package by.jonline.module2;

public class ArraysTask3 {
    public static void main(String[]args) {
        int n =7;
        double[] k = new double[n];
        int countPos =0;
        int countNeg =0;
        int countNull =0;
        for(int i=0;i<n;i++) {k[i]=Math.random()*20-10.0;}
        for(int i=0;i<n;i++) {if (k[i]>0) {countPos++;}else if(k[i]<0) {countNeg++;} else countNull++;}
        System.out.println("There are "+countPos+" positive numbers, "+countNeg+" negative munbers, and "+countNull+" equal to null numbers.");

    }

}
