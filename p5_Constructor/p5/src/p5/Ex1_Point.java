package p5;

public class Point {
    private int x;
    private int y;
    public Ex1_Point() {
    	//System.out.println("인수없는 생성자!!"); 
    }
    public Point(int _x,int _y){
    	x=_x;//멤버변수=매개변수;
    	y=_y;
    	//System.out.println("인수있는 생성자!!"); 
    }
    public void show(){
    	System.out.printf("x : %3d\t\ty : %3d\n",x,y);
    }
}
