package p6;

public class Ex5_UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		//arg = 31; //final 특성 때문에 수정 불가 
		//localVar = 41; final 특성 때문에 수정 불가 
		
		//람다식
		Ex1_MyFunctionalInterface fi = () ->{
			//로컬변수 사용
			System.out.println("arg:"+ arg); //final이 생략됨
			System.out.println("localVar:"+ localVar + "\n");
		};
		fi.method();
	}
}
