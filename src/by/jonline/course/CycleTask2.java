package by.jonline.course;

public class CycleTask2 {
	public static void main(String[]args) {
		int	a=-10,b=10,h=1;
		int y =0;
		while(a<=b) {
			if(a>2) {
				y=a;
			System.out.println("X  "+a+"| Y "+y);
			}
			else if(a<=2) {
				y=a*(-1);
			System.out.println("X  "+a+"| Y "+y);
			}
			
			a+=h;
		}	
	}

}
