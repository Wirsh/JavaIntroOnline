package by.jonline.module1;

public class LinearTask5 {
	public static void main(String[]args) {
		int t =7412;
		int h =t/3600;//количество часов
		int m =t/60-(h*60);//остаток минут
		int s =t/1-(h*3600)-(m*60);//остаток секунд
		System.out.println("HH "+h+" MM "+m+" SS "+s);
	}

}
