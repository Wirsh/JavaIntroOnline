package by.jonline.course;
import java.util.Scanner;
public class BranchingTask5 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	double x =sc.nextDouble(),y;
	if(x<=3) {y=Math.pow(x, 2)+3*x+9; System.out.println(y);}
	else if(x>3) {y=1/(Math.pow(x, 3)+6); System.out.println(y);} 
}
}
