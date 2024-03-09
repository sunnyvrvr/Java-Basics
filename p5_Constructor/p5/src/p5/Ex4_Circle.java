package p5;/* class Circle를 정의해보면?
반지름 : 5
원의 넓이 : xxx.xxxx
원의 들레 : xxx.xxxx
*/

public class Ex4_Circle {

	public static void main(String[] args) {
		Circle p=new Circle(5);
		System.out.printf("반지름 : %d\n",p.getR());
        System.out.printf("원의 넓이 : %8.4f\n",p.getArea());
       // System.out.println(Math.PI);//3.141592653589793
		System.out.printf("원의 둘레 : %8.4f\n",p.getAround());
	}
}
class Circle{
	private int r;
	public Circle(int _r){ r=_r;	}
	public double getArea(){ return r*r*Math.PI;  }
	public double getAround(){ return 2*r*Math.PI;}
	public int getR(){ return  r;  }
}