package p6;

public class Ex6_UsingThis {
	public int outterField = 10;
	 
	class Inner{
		int innerField = 20;
		
		void method() {
			Ex1_MyFunctionalInterface fi = ()->{
				System.out.println("outterField" + "outterField");  
				System.out.println("outterField" + Ex6_UsingThis.this.outterField);   //this.field 생략		
				System.out.println("innerField");
			};
			fi.method();
		}
	}
}
