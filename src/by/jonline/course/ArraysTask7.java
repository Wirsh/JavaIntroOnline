package by.jonline.course;

public class ArraysTask7 {
    public static void main(String[] args) {
        double[] a = new double[11];
        double sum=0;
        for (int i = 0; i < 11; i++) {a[i] =Math.round(Math.random()*10);}
        for (int i = 0,j=a.length-1; i <j ; i++,j--) {if((a[i]+a[j])>sum){sum=a[i]+a[j];} }
        System.out.println(sum);
    }
}
