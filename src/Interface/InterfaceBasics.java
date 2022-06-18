package Interface;

interface Car{
	public static final int x=10;
	public abstract void myCar();
}
interface Bike {
	int y=6;
	void myBike();
}
interface Cycle extends Car,Bike{
	
}
class Ford implements Car,Bike{
	@Override
	public void myBike() {
		// TODO Auto-generated method stub
		System.out.println("Ford Implements Bike - "+y);
		
	}
	@Override
	public void myCar() {
		// TODO Auto-generated method stub
		System.out.println("mycar Overriden-1 =>"+Car.x);
		
	}	
}
class Maruti extends Ford implements Car {
	
	void show(){

		Car obj = new Car(){	
			@Override
			public void myCar() {
				// TODO Auto-generated method stub
				System.out.println("myCar overriden-2 =>"+x);
				
			}			
		};
		obj.myCar();
		System.out.println(obj);
		Car obj2 = new Maruti();
		System.out.println(obj2);
		obj2.myCar();
	}	
}
public class InterfaceBasics {
	public static void main(String[] args) {
		/*
		 * 1-Similar to abstract class
		 * 2- **interface** keyword is used to declare an interface
		 * 3- **implement** keyword is used to inherit interface
		 * 4-By default all variables are public static final
		 * 5-By default all methods are public abstract
		 * 6-IS-A relation is used in implementing it.
		 * 7-We cannot give body to the methods.
		 * 8-it gives its features to others (Interface is a way of imposing restrictions)
		 * 9-It does not have any actual existence
		 * 10-Multiple Inheritance can be done using Interface. We can extend one class and implement another interface at the same time.
		 * 12-**Always try to use variables of Interface with its Interface name**
		 * 13-One Interface can extend multiple Interfaces
		 * 
		 * 14-interface to interface => extends
		 * 15-class to interface 	 => implements
		 * 16-class to class		 => extends
		 * 17-we cannot instantiate an interface
		 * 
		 * 
		 * */
		Maruti maruti = new Maruti();
		maruti.show();
	}
}
