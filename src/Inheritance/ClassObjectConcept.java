package Inheritance;

class Vehicle1{
	void move(){
		System.out.println("Vehicle is here.");
	}
}
class Car5 extends Vehicle1{	
	private int brake;
	private int wheels;
	void move(){		
		System.out.println("Car has feature and can move.");
	}
	void show(){		
		System.out.println("Car can show.");
	}
}
public class ClassObjectConcept {
	public static void main(String[] args) {
		
		Vehicle1 vehicle = new Car5();
		vehicle.move();
		vehicle.show();
		
	}

}
