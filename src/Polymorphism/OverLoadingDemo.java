package Polymorphism;
class Car301{
	private final int value=10;
	void show1(){
		System.out.println("Show1-No Return + No Argument");
	}
	int show2(int a, double b){
		System.out.println("Show2-With Return + 2Argument\ta=" + a +"\tb="+b);
		return (int)(a+b);
	}
	void show2(int a, int b, int c){
		System.out.println("Show1-No Return + 3Argument\ta=" + a +"\tb="+b+"\tc="+c);
	}
	double show2(int a, double b, int c){
		System.out.println("Show2-With Return + 3Argument\ta=" + a +"\tb="+b+"\tc="+c);
		return value;
	}
	void driver(){
		show1();
		System.out.println(show2(5,14));
		show2(10,12,345);
		System.out.println(show2(10,12.0,345));
		
	}
}
public class OverLoadingDemo {
	public static void main(String[] args) {
		Car301 car301 = new Car301();
		car301.driver();
	}

}
