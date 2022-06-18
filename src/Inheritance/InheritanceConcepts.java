package Inheritance;

class Car{
	Car(){
		System.out.println("Constructor of Car class.");
	}
	Car (int a){
		System.out.println("constructor2="+a);
	}
	private int brake;
	private int wheels;
	void move(){
		int x=10;
		System.out.println("Car has feature and can move.");
	}
	public int getBrake() {
		return brake;
	}
	public void setBrake(int brake) {
		this.brake = brake;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}	
}
class Ford extends Car{
	Ford(){
		super(10);
		Car  c = new Car();
		System.out.println("Constructor of Ford class. ->"+super.getBrake());
	}
	Ford(Car c){
		this();
		System.out.println("Ford has "+c.getWheels()+" from Ford Constructor.");
		
	}
	int speed= 180;
	boolean h_back=true;
	void fmove(){
		System.out.println("Ford class is here.");
	}
}
class Swift extends Car{
	int speed= 180;
	boolean h_back=true;
	void smove(){
		System.out.println("Swift class is here.");
	}
}
public class InheritanceConcepts {
	public static void main(String[] args) {
		/*
		 * IS-A relation
		 * eg: Swift is a car.
		 * 1- It is a way to re-use code
		 * 2- between two classes using the extends keyword
		 * 3- Super class / Parent class (the class which has been extended)
		 * 4- Sub class / Base class (which extends)
		 * 5- A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
		 * 6- Child instance cannot refer to parent type reference variable.
		 * 7- Parent type reference variable can store child type reference variable, but can access only parent members.
		 * */
		Ford ford = new Ford();
		System.out.println("Ford Classsssssssssssssss");
		Ford ford2 = new Ford(new Car(10));
		System.out.println("Ford Class Started");
		ford.move();
		ford.fmove();
		ford.setBrake(2);
		ford.setWheels(4);
		System.out.println("Ford has "+ford.getWheels());
		System.out.println("Ford has "+ford.getBrake());
		
		System.out.println("Ford Class Endedn");
		
		System.out.println("Swift Class");
		Swift swift = new Swift();
		swift.move();
		swift.smove();
		
		/*Access Specifiers
		 * 1-Private:
		 * 	->Class, variables, methods
		 * 	->Only inside the class where it is mentioned
		 * 2-This: (Keyword and method both)
		 * 	->It refers to its class instance variable
		 * 	->cannot be used in static method
		 * 	->used to access the currently executing object members
		 *  -> this() can be used only inside constructor.
		 *  ->Should be the first statement of constructor.
		 *  ->only one this() can be used in one constructor.
		 * 3-Super: (Keyword and method both)
		 * 	->to access the members of the parent class.
		 *  ->super() is used to invoke parent class constructor.
		 * 	->cannot be used in static methods
		 * 	->It is the first line of every constructor in child class.
		 * 	->By default every constructor invokes super constructor which is hidden by JVM.
		 * ->
		 * 	
		 * */
	}

}
