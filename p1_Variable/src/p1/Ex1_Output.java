package p1;
/*
1) 형) System.out.println("출력 대상 문자열");
     : 출력 대상 문자열을 출력후 커서 내림 (enter key기능 있음)
2) 형) System.out.print("출력 대상 문자열");
     : 출력 대상 문자열을 출력후 커서 내리지 않음 (enter key기능 없음)
*/
public class Ex1_Output {

	public static void main(String[] args) {		
		System.out.println("Hello Java?");
		System.out.println("이름 : 홍 길 동");
		System.out.print("kim ");
		System.out.print("min ");
		System.out.print("jin\n");
		System.out.println("\n------------------------------");
		//  '\t' : 1byte문자 , tab key기능 즉 정해진 위치에 커서를 둠 
		System.out.println("123456789012345678901234567890");
		System.out.println("ab\tCDE\t홍 길 동");//9col     17col  25col
		System.out.println("ab\tCDE\tjin soo");
		System.out.println("ab\t\tCDE\tjin soo");
		//개행을 맞춰서 적는법 알기
	}
}





