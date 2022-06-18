package Inheritance;
class Car1{	
	private int brake;
	private int wheels;
	void move(){		
		System.out.println("Car has feature and can move.");
	}		
}
class Ford1 extends Car1{
	int speed= 180;
	boolean h_back=true;
	void fmove(){
		System.out.println("Ford class is here.");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Ford1 ford = new Ford1();
		ford.fmove();
		ford.move();
	}
}
