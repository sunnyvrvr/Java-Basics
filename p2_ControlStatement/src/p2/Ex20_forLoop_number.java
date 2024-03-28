package p2;

public class Ex20_forLoop_number {
	public static void main(String[] args) {
		int sum = 0;
		for (int j=1; j<=100; j++) { //1~10까지
			sum =sum + j;
		}
		System.out.println(sum);
		
		int i;
		for ( i=0; i<5; i++) {
			System.out.println(i+":WELCOME");		
		} //a가 5가 되면 반복문을 빠져나온다 
		
		for (int j=0; j< 5; j++ ) {
			System.out.println(j+1); //1,2,3,4,5
			System.out.println(j+1+10);//11,12,13,14,15
		}
		
		//1에서 10씩 증가한 숫자를 50개 출력하시오 1, 11, 21, 31, 41
		for (i=0; i < 50; i++ ) { //몇번- 반복을 한 것인지 조건식에 적음
			System.out.println(i*10+1+" "); 
		} 
		
		//1,11,21,31,41 - 수식논리를 세우고 식을 작성하기 
		for (i=0; i < 5; i++ ) { //몇번- 반복을 한 것인지 조건식에 적음
			if(i>0) {
				System.out.print(",");
			}
			System.out.print(i*10+1); 
		} 
		System.out.println(); 
	}

}
