package p5;/*
x : 0    y :  0
x : 2    y :  5
x : 4    y : 10
x : 6    y : 15
x : 8    y : 20
*/

public class Ex6_PointObject {

	public static void main(String[] args) {
		// int a[]=new int[5]; int형 배열객체 생성 및 선언 
		Point p[]=new Point[5];//Point형의 배열객체 생성 및 선언 
		for(int i=0;i<p.length;i++) {
			p[i]=new Point(i*2,i*5);// Point객체의 생성!!
		}
		for(int i=0;i<p.length;i++) {
			p[i].show();
		}
	}
}
