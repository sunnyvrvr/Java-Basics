package p2;

public class Ex21_forLoop_number2 {

	public static void main(String[] args) {
		//1~100까지 출력하시오. 단, 짝수는 출력하지 않는다
		for(int i=1; i<100; i++) {
			if (i%2 == 0 ) {
				continue;
			}
			System.out.println(i);	
		}

		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

		//홀수만 출력하는 코드
		for (int j = 1; j<=100; j+=2) {
			if(j>1) {
				System.out.print(',');
			}
			System.out.print(j);		
		}
		//1~100까지의 합을 출력하게요
		int sum = 0;
		for(int i=1 ; i<=100; i++) {
			//sum =sum+ i
			sum +=i;
			System.out.print("1~100합:"+sum);					
		}	
	}

}
