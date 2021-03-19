package by.jonline.module2;

public class ArraysTask8 {
//    Дана последовательность целых чисел a1,a2 ,an. Образовать новую последовательность, выбросив из
//    исходной те члены, которые равны min(a1,a2,...,an).
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        //заполняем массив случайными числами от 0 до 10
        for (int i = 0; i < 10; i++) {
            arrayA[i] = (int) (Math.random() * 10);
            System.out.print(arrayA[i]+" ");
        }
        int min = arrayA[0];
        int minCounter =0;
        //находим min
        for (int i = 0; i < 10; i++) {
            if (arrayA[i] < min) {
                min = arrayA[i];
            }
        }
        //считаем количество значений массива еквивалентных min
        for (int i = 0; i < 10; i++) {
            if (arrayA[i] == min) {
                minCounter++; }
        }
        //создаем новый массив b размерностью a.length-minCounter
        int[] arrayB = new int[arrayA.length-minCounter];
        int c =-1;
        System.out.println();
        //заполняем массив b значениями массива а, игнорируя значения эквивалентные min
        for(int arrNumber: arrayA ){ if(arrNumber !=min ) { ++c; arrayB[c]=arrNumber;
            System.out.print(arrayB[c]+" "); } }
        System.out.println("\nmin ="+min);
        System.out.println("count ="+minCounter);


    }
}
