package Inheritance;

class Vehicle{
	void move(){
		System.out.println("Vehicle is here.");
	}
}
class Car4 extends Vehicle{	
	private int brake;
	private int wheels;
	void move(){		
		System.out.println("Car has feature and can move.");
	}
	void show(){		
		System.out.println("Car can show.");
	}
}
//Ford is a car
//Ford is a vehicle
class Ford4 extends Car4,Vehicle
{
	int speed= 180;
	boolean h_back=true;
	
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Ford4 ford = new Ford4();
		ford.move();
		
		/*
		 * Multiple Inheritance concepts:
		 * 1- A class can extend only one super class.
		 * 2- Multiple Inheritance is not supported in Java due to Ambiguity (Method Dispatch Failure).
		 * 3- Multiple Inheritance can be achieved using Interface.
		 * 
		 * */
	}

}
