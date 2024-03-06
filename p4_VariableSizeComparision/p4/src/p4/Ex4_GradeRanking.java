package p4;/*5명의 기본자료를 입력하여 배열변수에 할당후, 아래처럼!!
#1)
번호? 11
이름? 홍 길 동
국어,영어?? 100 95
#2)
번호? 12
이름? 이이
....
                           *성적표*
번호    이름     국어     영어     총점       평균    평가   등수
xxx  xxxx   xxx   xxx   xxx    xxx.x       x     x
...
----------------------------------------------------
국어 최고점수 : xxx
영어 최저점수 : xxx
                        *성적표(등수순)*
번호    이름     국어     영어     총점       평균    평가   등수
xxx  xxxx   xxx   xxx   xxx    xxx.x       x     1
...
*/

import java.util.Scanner;

public class Ex4_GradeRanking {
	static final int size=5;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		String line="-------------------------------------------------------------------";
		int hno[]=new int[size];		int kor[]=new int[size];
		int eng[]=new int[size];		int tot[]=new int[size];  int rn[]=new int[size];
		int temp=0;
		float ave[]=new float[size];  float tave=0.0F;
		char grade[]=new char[size]; char tgrade='@';
		String name[]=new String[size];	String tname="@@@";	
		for(int i=0;i<size;i++) {
			System.out.printf("#%d)\n",i+1);
			System.out.print("   번호? ");hno[i]=sc.nextInt();
			System.out.print("   이름? ");name[i]=tc.nextLine();
			System.out.print("   국어,영어?? ");kor[i]=sc.nextInt();			
			                                                   eng[i]=sc.nextInt();
			 tot[i]=kor[i]+ eng[i];  //총점      
			 ave[i]=tot[i]/2.0F;
				 switch(   (int)ave[i]/10   ) //(int)97.5f-->97, 97/10--> 9
				 {
				 case 10:
				 case 9:grade[i]='A';break;
				 case 8:grade[i]='B';break;
				 case 7:grade[i]='C';break;
				 case 6:grade[i]='D';break;
				 default:grade[i]='F';break;
				 }//switch		  
		}//for i  	
		//최대, 최소 구하기
		int maxkor=kor[0]; 
		int mineng=eng[0];
		for(int i=1;i<size;i++) {
			if(maxkor < kor[i])	maxkor=kor[i];	 
			if(mineng > eng[i])	mineng=eng[i];
		}
		//5명의 총점이 결정된 후 등수구하기
		for(int i=0;i<size ;i++) {
			rn[i]=1;//비교전 1등의 초기치 
			for(int j=0;j<size;j++) {
				if(tot[i] <  tot[j]) rn[i]++;
			}
		}
		System.out.println("\n                             *성적표*");
		System.out.println("번호\t이름\t\t국어\t영어\t총점\t  평균\t평가\t등수");
		for(int i=0;i<size;i++) {			
			System.out.printf("%3d\t%-12s\t%3d\t%3d\t%3d\t%5.1f\t%3c\t%3d\n",
	    		hno[i],name[i],kor[i],eng[i],tot[i],ave[i],grade[i],rn[i]);       
		}//for i
		System.out.println(line);
		System.out.printf("국어 최고점수 : %3d\n",maxkor);
		System.out.printf("영어 최저점수 : %3d\n",mineng);
		//등수로 정렬하기
		for(int i=0;i<size-1 ;i++) {
			for(int j=i+1;j<size;j++) {
				if(rn[i]  > rn[j])//5 >  1
				{//서로의 값 바꾸기 
					temp=hno[i];				hno[i]=hno[j];			hno[j]=temp;
					tname=name[i];  name[i]=name[j];  name[j]=tname;
					temp=kor[i];				kor[i]=kor[j];				kor[j]=temp;
					temp=eng[i];				eng[i]=eng[j];			eng[j]=temp;
					temp=tot[i];				tot[i]=tot[j];				tot[j]=temp;
					tave=ave[i];               ave[i]=ave[j];				ave[j]=tave;
					tgrade=grade[i];    grade[i]=grade[j];			grade[j]=tgrade;
					temp=rn[i];					rn[i]=rn[j];					rn[j]=temp;
				}//if
			}//for j
		}//for i
		System.out.println("\n                          *성적표(등수순)*");
		System.out.println("번호\t이름\t\t국어\t영어\t총점\t  평균\t평가\t등수");
		for(int i=0;i<size;i++) {			
			System.out.printf("%3d\t%-12s\t%3d\t%3d\t%3d\t%5.1f\t%3c\t%3d\n",
	    		hno[i],name[i],kor[i],eng[i],tot[i],ave[i],grade[i],rn[i]);       
		}//
		sc.close();
		tc.close();
	}
}
