package Encapsulation;

class Car12{
	protected int wheels=12;	 	
	protected void show(){
		System.out.println("A-Show");
	}
}
class Swift12 extends Car12{
	//IS-A Relation
	//Swift IS-A car
	void show2(){
		show();
		System.out.println("B-Show" + wheels);
	}
}
public class ProtectedKeywordDemo {
	public static void main(String[] args) {
		Swift12 swift12 = new Swift12();
		swift12.show2();
		swift12.show();
		
		
	}

}
