package p7;

public class Overload {
	double area; //사각형의 넓이 변수 선언	
	Overload(){
		area = 0;
	}
	/*정사각형의 넓이 구하는 함수*/
	void make(double side) {  
		area = side * side;
	}
	/*직사각형의 넓이 구하는 함수*/
	void make(double width, double height) {  
		area = width * height;
	}
	/*사다리꼴의 넓이 구하는 함수*/
	void make(double upperBase, double lowerBase, double height) {
		area = (upperBase + lowerBase)/2*height;
	}	
	void print() {
		System.out.println("사각형의 면적은 " +area+ " 입니다");
	}

	public static void main(String[] args) {
		Overload sqaure = new Overload();
		sqaure.make(3); //정사각형의 한변의 길이:3
		sqaure.print();
		
		Overload rectangle = new Overload();
		rectangle.make(3,4); //직사각형의 너비:3, 높이:4
		rectangle.print();	
		
		Overload trapezoid = new Overload();
		trapezoid.make(3,5,2); //사다리꼴의 윗변:3, 아랫변:5, 높이:2
		trapezoid.print();	
	}
}



