package by.jonline.course;

public class ArraysTask1 {
    public static void main(String[]args) {
        int k =5;
        int []a = {5,15,48,30,6,14,55};
        int sum=0;
        for(int i = a.length - 1; i >= 0; i--) {if(a[i]%5>0) {
            sum+=a[i];
            System.out.println(a[i]+"   "+sum);}}
    }


}