package p6;

public class Ex3_MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		Ex1_MyFunctionalInterface fi; //객체를 가져옴 

		//람다식1
		fi = () ->{
			String str ="method call1";
			System.out.println(str);
		};
		fi.method(); //메소드 호출

		//람다식2 약식 작성 
		fi = () ->{System.out.println("method call2");};
		fi.method(); 

		//람다식3 약식작성
		fi = () ->System.out.println("method call3");
		fi.method(); 			
		//heap에 새로운 객체를 만듦. 앞에 있는 객체는 가비지가 됨 


		//람다식을 쓰지않고 anonymous 익명클래스를 사용하여 익명함수를 만드는 법
		fi = new Ex1_MyFunctionalInterface (){
			public void method(){
				System.out.println("method call4");
			};
		};
		fi.method();

	}
}
