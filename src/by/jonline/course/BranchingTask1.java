package by.jonline.course;

public class BranchingTask1 {
	public static void main(String[] args) {
		int a =45;
		int b =90;
		int c =45;
		if(a+b+c==180 && (a==90||b==90||c==90)) {System.out.println("Triangle is possible and right-angled ");} 
		else if(a+b+c==180){System.out.println("Triangle is possible ");}
		else {System.out.println("Triangle isn`t possible ");}
	}

}
