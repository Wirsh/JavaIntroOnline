package javaIntroOnline;
import java.util.Scanner;
public class CycleTask1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = Math.abs(sc.nextInt());
		int a =0;
		for(int i =0; i<=x; i++) {	a+=i;}
		System.out.println(a);

}
}