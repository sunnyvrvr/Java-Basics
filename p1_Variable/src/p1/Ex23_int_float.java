package p1;

import java.util.Scanner;
public class Ex23_int_float {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//		String[] subject;
		//		subject [0] = "국어"; subject [1] = "영어"; subject [2] = "수학";

		//		String[] subject = new String[3];
		String[] subject = {"국어", "영어", "수학"}; 
		//		subject = {"K", "E"," M"};

		int[]scoreArr;
		scoreArr = new int[3];
		//		scoreArr[0] = 10;
		//		scoreArr[1] = 8;
		//		scoreArr[2] = 5;

		System.out.print("국어점수:");
		scoreArr[0] = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수:");
		scoreArr[1] = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수:");
		scoreArr[2] = Integer.parseInt(sc.nextLine());


		int size = scoreArr.length; //length를 변수로 만들기 
		//length 계산을 반복할 필요없음	
		//변하지 않는 코드 - 반복문 안쪽에 넣기 
		for(int i=0; i<size; i++) {
			System.out.print(subject[i]+"점수:");	
			scoreArr[i] = Integer.parseInt(sc.nextLine());			
		} 

		int totalScore = 0;
		int aveScore = 0;

		for(int i=0; i<size; i++) { //배열의 길이
			totalScore += scoreArr[i];
			//			aveScore = totalScore/scoreArr.length;
		}
		System.out.println("총점: " + totalScore);		
		//		System.out.println("평균: " + (int)(totalScore/3F));
		System.out.println("평균: " + (float)totalScore/size);	 //float 타입으로 변경
	}
	//정수를 정수로 나누면 정수로 나옴 
	//정수를 실수로 나누면 실수로 나옴 
}

