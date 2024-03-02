package p3;//3장ppt8
public class Ex11_alphabet {

public static void main(String[] args) {
       char ch = 'a';
       /*System.out.printf("%c\t%d\n",ch,(int)ch);//a    97
       System.out.printf("%c\t%d\n",'b',(int)'b');//b    98
       System.out.println('a'<'b');// true
       */
       do {
			System.out.print(ch);
			//ch=ch+1;//int형을 char형의 ch변수에 convert안됨 
			ch = (char) (ch + 1);//강제적 형변환 주의!!
		} while (ch <= 'z'); 	


	}

}
