package by.jonline.course;

public class ArraysTask2 {
    public static void main(String[]args) {
        double []a = {50,6.5,5.4,10,14.1,1,2,3,4.9};
        double z =5;
        int counter =0;
        for(int i=0;i<a.length;i++) {if (a[i]<z) {counter++;a[i]=z;}}
        System.out.println(counter);
    }

}
