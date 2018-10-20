package task1;

import task1.vehicle;
import java.io.IOException;
import java.util.Scanner;
public class Control {
	static Plane plane = null;
	static Car car = null;
	static High_Speed  high_speed= null;
	
	public Control(){
		plane = new Plane();
		car = new Car();
		high_speed = new High_Speed();
	}
	
	public static void main(String[] args) throws IOException {
		new Control();
		Scanner sc = new Scanner(System.in);
		System.out.print("����������أ�");
		String placeOfBegin = sc.nextLine(); 
		System.out.print("�����Ŀ�ĵأ�");
		String destination = sc.nextLine();
		System.out.print("���������(km)��");
		int distance = sc.nextInt();
		car.print(placeOfBegin, destination, distance);
		System.out.println();
		high_speed.print(placeOfBegin, destination, distance);
		System.out.println();
		plane.print(placeOfBegin, destination, distance);
		sc.close();
	}
}
