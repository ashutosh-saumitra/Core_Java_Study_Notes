package Inheritance;
class Car2{	
	private int brake;
	private int wheels;
	void move(){		
		System.out.println("Car has feature and can move.");
	}		
}
class Ford2 extends Car2{
	int speed= 180;
	boolean h_back=true;
	static void fmove(){
		//super(); //12->super() cannot be called in Static method.
		System.out.println("Ford class is here.");
	}
}
class Swift2 extends Ford2{
	int speed= 180;
	boolean h_back=true;
	void smove(){
		System.out.println("Swift class is here.");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Ford2 ford2=new Ford2();
		ford2.move();
		Ford2.fmove();
		
		Swift2 swift = new Swift2();
		swift.fmove();
		swift.smove();
		swift.move();
		
		
	}

}
