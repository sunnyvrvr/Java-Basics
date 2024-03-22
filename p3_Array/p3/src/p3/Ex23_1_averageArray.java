package p3;
import java.util.Scanner;
public class Ex23_1_averageArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[][] studentArr = new int[5][3];
		int totalKor = 0;
		int totalEng = 0;
		int totalMath = 0;
		
		for(int j=0; j<5; j++) { 
			String[] subject = {"국어", "영어", "수학"};
			int size = studentArr[j].length;
			for(int i=0; i<size; i++) {
				System.out.print(subject[i] + "점수:");
				studentArr[j][i] = Integer.parseInt(sc.nextLine());
			} //점수입력 5번 반복
			
			
			//총점
			int totalScore = 0;
			for(int i=0; i<size; i++) {
				totalScore += studentArr[j][i];
			}
		
			System.out.println("총점:" + totalScore);
			System.out.println("평균:" + totalScore/(double)size);
			
		}
		for(int i=0; i<5; i++) {
			totalKor += studentArr[i][0];
		}
		for(int i=0; i<5; i++) {
			totalEng += studentArr[i][1];
		}
		for(int i=0; i<5; i++) {
			totalMath += studentArr[i][2];
		}
		
		System.out.println("국어 평균:" + (float)totalKor/5);
		System.out.println("영어 평균:" + (float)totalEng/5);
		System.out.println("수학 평균:" + (float)totalMath/5);
			
	}

   }

