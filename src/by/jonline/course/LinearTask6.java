package by.jonline.course;
import java.util.Scanner;
public class LinearTask6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean figure1 = (x>=-2&&x<=2)&&(y>=0&&y<=4);
		boolean figure2 = (x>=-4&&x<=4)&&(y>=-3&&y<=0);
		boolean res = (figure1||figure2);
		System.out.println(res);
	}

}
