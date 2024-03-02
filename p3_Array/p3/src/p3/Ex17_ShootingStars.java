package p3;/*다중for
★
★★
★★★
★★★★
★★★★★

★★★★
★★★
★★
★
*/
public class Ex17_ShootingStars {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i ;j++) {
				System.out.print("★");
			}//for j
			System.out.println();
		}//for i
		System.out.println();
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i ;j++) {
				System.out.print("★");
			}//for j
			System.out.println();
		}//for i
	}
}
