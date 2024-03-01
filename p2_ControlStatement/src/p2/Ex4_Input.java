package p2;
//2장ppt 26
import java.util.Scanner;
public class Ex4_Input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next(); // "Kim"
		String city = scanner.next(); // "Seoul"
		int age = scanner.nextInt(); // 20
		double weight = scanner.nextDouble(); // 65.1
		boolean single = scanner.nextBoolean(); // true
		
		System.out.println("이름"+name);
		System.out.println("거주지"+city);
		System.out.println("나이"+age);
		System.out.println("체중"+weight);		
		System.out.println("결혼여부"+single);		
	}
}
