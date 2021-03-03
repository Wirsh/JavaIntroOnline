package by.jonline.course;

public class BranchingTask4 {
	public static void main(String[]args)
	{
		int a=10, b=6; 
		int x =2, y=44, z=5;
		if(a>=x&&b>=y||b>=x&&a>=y) 
		{System.out.println("It`s OK!");}
		else if(a>=x&&b>=z||b>=x&&a>=z)
		{System.out.println("It`s OK!");}
		else if(a>=z&&b>=y||b>=z&&a>=y)
		{System.out.println("It`s OK!");}
		else {System.out.println("It does not pass");}


	}
}
