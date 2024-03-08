package p5;/*
p---
x : 0      y : 0


*/

public class Ex2_pointRef{

	public static void main(String[] args) {
		Point p=new Point();
		Point q=new Point(100,200);
		System.out.println("p-----");
		p.show();
		System.out.println("\nq-----");
		q.show();
	}

}
