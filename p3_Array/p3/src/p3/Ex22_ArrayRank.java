package p3;

public class Ex22_ArrayRank {

	public static void main(String[] args) {
		int score[]= {85,70,80,95,100};
		int rn[]=new int[score.length]; 길이를 배열의 갯수로 지정

		for(int i=0;iscore.length;i++) i를 기준
		{
			rn[i]=1;
			for(int j=0;jscore.length;j++)	비교대상
			{
				if(score[i] score[j]) rn[i]++;
			}
		}
		System.out.println(점수t등수);
		for(int i=0;iscore.length;i++) {
			System.out.printf(%3dt%3dn,score[i],rn[i]);
		}
	}
}
