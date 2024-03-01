package p1;/*이름 이 민 정, 왼쪽시력 0.2   오른쪽시력 0.1을 변수에 할당후,
평균시력을 구해 아래처럼!
"이 민 정"의 
평균'시력은 \0.15\입니다.
*/

public class Ex14_CharacterOutput {

	public static void main(String[] args) {
		String name="이 민 정";
		double leye=0.2;
		double reye=0.1;
        
		double ave=(leye+reye)/2;	
	
		System.out.printf("\"%s\"의\n",name);//==System.out.println("\""+name+"\"의");		
		System.out.printf("평균'시력은 \\%.2f\\입니다.\n",ave);
	}
}
