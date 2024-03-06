package p4;/*
점수    등수
----------
185    3
200    1
195    2
165    5
170    4
 */

public class Ex1_forloop_ranking {

	public static void main(String[] args) {
		int score[]= {185,200,195,165,170};
		String line="-----------";
		int rn[]=new int[score.length];
		//등수구하기
		for(int i=0;i<score.length   ;i++) //i를 기준 
		{
			rn[i]=1;//비교전 초기치 1등 
			for(int j=0;j<score.length;j++) //j는 비교대상
			{//rn[i]=rn[i]+1;
				//if(i==j) continue;
				//System.out.printf("비교 ... i : %d\tj : %d\n",i,j);
				if(score[i] <   score[j]) rn[i]++;
			}        	
		}
		System.out.println("점수\t등수");
		System.out.println(line);
		for(int i=0;i<score.length;i++) {
			System.out.printf("%3d\t%3d\n",score[i],rn[i]);
		}
	}
}
