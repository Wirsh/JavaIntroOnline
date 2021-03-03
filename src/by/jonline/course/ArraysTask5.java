package by.jonline.course;

public class ArraysTask5 {
    public static void main(String[] args) {
        int[]a= new int[20];
        for (int i = 0; i <20 ; i++) {a[i] =(int) Math.round(Math.random()*20-10); System.out.print(" "+a[i]);}
        for (int i = 0; i <20; i++) {if(a[i]>i){ System.out.print("\n a[i] "+a[i]+" > i "+i);} }
    }
}

