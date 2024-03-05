package p_review;

public class Ex20_1_DeclareArray {

	public static void main(String[] args) {
		//1 배열선언: 초깃값이 없는배열- 타입1
		int a[];
		a = new int[5];		
		System.out.println(a.length);	
		//int intArray[] = new int[5]; 
		
		//1 배열선언: 초깃값이 있는배열- 타입2
		//2 배열선언+배열생성: 선언과 동시에 배열생성
		//		int intArray[] = new int[5]; 
		//		int intArray[] = new int[5]; 
		//		System.out.println(intArray.length);		
		//2 배열선언+배열생성: 초깃값이 있는 배열
		int intArray[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(intArray.length);
	}
}
