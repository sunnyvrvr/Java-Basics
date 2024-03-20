package p4;/*점수를 배열에 할당후, 등수는 사용자함수[ Rank    ]에서 구하고,
출력도 사용자함수[  Disp  ]에서 함!
점수    등수
----------
185    3
200    1
195    2
165    5
170    4
*/

public class Ex13_ReferenceType_array {
	static void  Disp(int sc[],int rrn[]){
    	String line="-----------";
    	System.out.println("점수\t등수");
        System.out.println(line);
        for(int i=0;i<sc.length;i++) {
        	System.out.printf("%3d\t%3d\n",sc[i],rrn[i]);
        }
    }
	static void Rank(int score[],int rn[]){
		//등수구하기
        for(int i=0;i<score.length   ;i++) //i를 기준 
        {
        	rn[i]=1;//비교전 초기치 1등 
        	for(int j=0;j<score.length;j++) //j는 비교대상
        	{         		
        	    if(score[i] <   score[j]) rn[i]++;
        	}        	
        }
	}
	public static void main(String[] args) {
		int score[]= {185,200,195,165,170};		
        int rn[]=new int[score.length];
        Rank(score,rn);     
        Disp(score,rn);    
	}
}
