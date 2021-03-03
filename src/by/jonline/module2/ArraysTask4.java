package by.jonline.module2;

public class ArraysTask4 {
    public static void main(String[]args){
        int[] n = new int [8];
        int m =0;
        for(int i=0;i<8;i++) {n[i]=(int) (Math.random() * 20 - 10);}
        for(int i=0;i<8;i++) {if(n[i]<=m) {m=n[i];}
        else if(n[i]>=m) {m=n[i];}
            System.out.println(m);
        }
    }

}


