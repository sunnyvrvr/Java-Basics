package p2;

import java.util.Calendar;

public class Ex18_Condition_input {

	public static void main(String[] args) {
		// if
		java.util.Scanner sc;
		java.util.Scanner tc;		
		sc = new java.util.Scanner(System.in);
		tc = new java.util.Scanner(System.in);	

		if(true) {}
		System.out.println("년도를 입력하세요");
		int year =  Integer.parseInt(sc.nextLine()); //string타입으로 옴- 참조형
		// String -> int로 변환 메서드
		//int vaule = Integer.parseInt(String);


		//		int year=2023;
		if(year%2==1) { //조건문 형식
			System.out.println("홀수해입니다");
		}

		// if else
		//		int hour=15;
		System.out.println("시간을 입력하세요");
		int hour = Integer.parseInt(sc.nextLine());
		if(hour<12) { //조건문 형식
			System.out.println("오전입니다");
		} else {
			System.out.println("오후입니다");
		}

		// if elseif

		System.out.println("월을 입력하세요");	
		int month = Integer.parseInt(sc.nextLine());
		//		int month=5;
		if(month<=3) { //조건문 형식
			System.out.println("1분기");
		}else if(month<=6) { //조건문 형식
			System.out.println("2분기");
		}else if(month<=9) { //조건문 형식
			System.out.println("3분기");
		}else if(month<=12) {
			System.out.println("4분기");
		} else /*(month<=12)*/{
			System.out.println("잘못입력했습니다. 다시입력해주세요");
		}		

		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());
		//100보다 더 큰 점수를 넣기
		if (score > 100) {
			System.out.println("존재하지않는 등급의 점수입니다");
		}else if (score == 100 || score >= 90) { //==100점이 좋음
			System.out.println("A");		
		}else if (score >= 80) {
			System.out.println("B");		
		}else if (score >= 70) {
			System.out.println("C");		
		}else if (score >= 60) {
			System.out.println("D");		
		}else {
			System.out.println("F");			
		}
		score = (int)(Math.random()*20)+81; //0.00<= <1.0, 81<= 101
		System.out.println("점수" + score);	

		String grade;
		if(score>=90) {
			if(score>=95) {
				grade = "A";
				grade +="++";
			} else {
				grade = "B";
				if(score >=85 ) {
					grade +="++";
				}
			}
			System.out.println(grade);
		}

		Calendar cal;
		cal = Calendar.getInstance();
		month = cal.get(Calendar.MONTH);
		System.out.println("현재"+(month+1)+"월입니다"); //0부터 인식해서 +1해야함
		if(month <6) {
			System.out.println("상반기입니다");
		} else {
			System.out.println("하반기입니다");			
		}

		//switch
		//월별 예제
		//		switch(month){
		//		int month = 1;
		//		if (month == 1) {
		//			System.out.println("1월");
		//		}
		month = 7;
		switch (month) {
		case 1: 
			System.out.println("1월");
			break;
		case 2: 
			System.out.println("2월");
			break;
		case 3: 
			System.out.println("3월");
			break;
		case 4: 
			System.out.println("4월");
			break;
		case 5: 
			System.out.println("5월");
			break;
		case 6: 
			System.out.println("6월");
			break;
		case 7: 
			System.out.println("7월");
			break;
		case 8: 
			System.out.println("8월");
			break;
		case 9: 
			System.out.println("9월");
			break;
		case 10: 
			System.out.println("10월");
			break;
		case 11: 
			System.out.println("11월");
			break;
		case 12: 
			System.out.println("12월"); 
			break;
		}	

		//month에 1을 넣기		
		switch (month+1) {
		case 1: 
		case 2:	
		case 3: 
		case 4: 
		case 5:
		case 6:
			System.out.println("상반기");
			break;
			/* 모든 경우의 수를 다 적을 필요는 없음
			 * case 7: case 8: case 9: case 10: case 11: case 12:
			 */
		default:
			System.out.println("하반기"); 
			break;
		}	
		System.out.println("출생년도를 입력하세요: ");
		int birthYear = Integer.parseInt(sc.nextLine());
		switch (birthYear % 12) {
		case 0 :
			System.out.println("원숭이");
			break;
		case 1 :
			System.out.println("닭");
			break;
		case 2 :
			System.out.println("개");
			break;
		case 3 :
			System.out.println("돼지");
			break;
		case 4 :
			System.out.println("쥐");
			break;
		case 5 :
			System.out.println("소");
			break;
		case 6 :
			System.out.println("호랑이");
			break;
		case 7 :
			System.out.println("토끼");
			break;		
		case 8 :
			System.out.println("용");
			break;		
		case 9 :
			System.out.println("뱀");
			break;			
		case 10 :
			System.out.println("말");
			break;	
		case 11: //default는 필요없다면 생략가능하다 
			System.out.println("양");
			break;
		}
		//	switch의 type : int, char, string, short
		//	long lon =123L;
		//	switch (lon) {
		//	}
		int []scoreArr ;
		scoreArr = new int[3];
		int size = scoreArr.length;
		System.out.println(size);
		System.out.println(scoreArr[-1]);

		int [][]arr2;
		arr2 = new int[3][4];
		arr2[1][2] = 7;

		boolean []bArrr ;
		bArrr = new boolean [3];
		int size2 = bArrr.length;
		System.out.println(size2);	
		System.out.println(bArrr[0]);	

	}	
}

