package p6;

public class Ex4_MyFunctionalInterfaceExample2 {

	public static void main(String[] args) {
		
	Ex2_MyFunctionalInterface2 fi; //객체를 가져옴 
	
	fi = (x,y) ->{
		int result = x +y;
		return result;
	};
    //변수나 메소드가 static일 때 한해서 '이탤릭 체'로 변경
	
	//out 변수 static
	//sum이라는 클래스는 MyFunctionalInterfaceExample2 클래스에 소속
	System.out.println(fi.method(2,5));
	//static 함수는 멤버변수에서 호출가능 - 단 this는 사용x, static은 객체가 없이 호출가능 
	//메인 함수가 static이라는 키워드가 없으면 반드시 객체가 있어야 한다
	//객체를 만들어서 객체에게 메소드를 전달하고 실행이 된다
	//메인 함수- entry point
	
	//람다식은 객체 - 다른 메소드에서도 가능
	}
	public static int sum(int x, int y) {
		return (x+y);
	}
	//public으로 쓰여져 있으면 아무곳에서나 쓰일 수 있음
	//public - 패키지 상관없음
	//default- 패키지 내부 
	//protected - 선조,후손관계
	//private 나 혼자만 사용 
	
	//utility라는 클래스를 만들기- public,static으로 아무대서나 그 함수를 불러씀
}
