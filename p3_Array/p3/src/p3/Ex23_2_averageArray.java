package p3;
import java.util.Scanner;
public class Ex23_2_averageArray {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				String [] subject = {"영어","수학","과학"};
		
				int [][]studentArr;
				studentArr = new int[5][3];
				for(int studentCnt=0; studentCnt<5; studentCnt++) {
					int size = studentArr[studentCnt].length;
					for(int i=0; i<size; i++) {
						System.out.print(subject[i]+"점수:");
						//scoreArr[i] = Integer.parseInt(sc.nextLine());
						studentArr[studentCnt][i] = Integer.parseInt(sc.nextLine());
					}
					int totalScore = 0;//총점
					
					for(int i=0; i<size; i++) {
						totalScore += studentArr[studentCnt][i];//scoreArr[i]; // totalScore = totalScore+scoreArr[i];
							
					}
					System.out.println("총점:" + totalScore);
					System.out.println("평균:" + (float)totalScore/size);
					
					int MAverage = 0;
					int EAverage = 0;
					int SAverage = 0;
					
					for ( int i=0; i<5; i++) {
						EAverage += studentArr[i][0];
						MAverage += studentArr[i][1];
						SAverage += studentArr[i][2];
					}			
				}
				System.out.println("영어의 총점:"+EAverage/3+ "영어평균:" + ((float)EAverage/5)/3);
				System.out.println("수학의 총점:"+MAverage/3+"수학평균:" + ((float)MAverage/5)/3);
				System.out.println("과학의 총점:"+SAverage/3 +"과학평균:" + ((float)SAverage/5)/3);
			}
		}

	}

}
