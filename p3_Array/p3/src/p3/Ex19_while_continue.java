package p3;/*100 ~ 200까지의 수중 7의 배수가 아닌수의 합을 구하면?
    while에서 continue :continue를 만나면 continue이하는 실행하지 않고,
    while의 조건식으로 분기
*/
public class Ex19_while_continue {

	public static void main(String[] args) {
		int i=99;
		int s=0;
		while( i  <  200 ) {
			i++;//주의 : while에서는 continue전에 증감식 위치
			if(i%7==0) continue;
			//System.out.printf("%d ",i);
			s+=i;
		}//while
		System.out.printf("7의 배수가 아닌수의 합 : %d\n",s);
	}
}
