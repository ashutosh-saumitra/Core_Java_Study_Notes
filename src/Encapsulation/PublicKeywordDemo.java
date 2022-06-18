package Encapsulation;

class Car10{
	public int wheels=10;
	public void show(){
		System.out.println("A-Show");
	}
}
class Swift10 extends Car10{
	//IS-A Relation
	//Swift IS-A car
	void show2(){
		System.out.println("B-Show");
		System.out.println("1-Car has wheels = "+wheels);
	}
}
public class PublicKeywordDemo {
	public static void main(String[] args) {
		//HAS-A relation
		//Swift HAS-A object
		Swift10 obj2 = new Swift10();
		obj2.show2();
		obj2.show();
		show();
		System.out.println("2-Car has wheels = "+wheels);
		
		
	}
}
