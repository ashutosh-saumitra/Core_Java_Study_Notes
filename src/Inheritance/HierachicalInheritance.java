package Inheritance;

class Car3{	
	private int brake;
	private int wheels;
	void move(){		
		System.out.println("Car has feature and can move.");
	}		
}
class Ford3 extends Car3{
	int speed= 180;
	boolean h_back=true;
	void fmove(){
		System.out.println("Ford class is here.");
	}
}
class Swift3 extends Car3{
	int speed= 180;
	boolean h_back=true;
	void smove(){
		System.out.println("Swift class is here.");
	}
}
public class HierachicalInheritance {
	public static void main(String[] args) {
		Ford3 ford3 = new Ford3();
		ford3.fmove();
		ford3.move();
		
		Swift3 swift3 = new Swift3();
		swift3.smove();
		swift3.move();
		
	}

}
