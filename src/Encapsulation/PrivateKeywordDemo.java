package Encapsulation;

class Car11{
	private int wheels;
	Car11(int wheels){
		this.wheels =wheels;
	}	
	private void show(){
		System.out.println("A-Show");
	}
	public int getWheels() {
		show();
		return wheels;		
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}
class Swift11 extends Car11{
	Swift11(int x){
		super(x);
	}
	//IS-A Relation
	//Swift IS-A car
	void show2(){
		//show();
		System.out.println("B-Show" + getWheels());
	}
}
public class PrivateKeywordDemo {
	public static void main(String[] args) {
		Swift11 obj2 = new Swift11(12);
		obj2.show2();
		System.out.println(obj2.getWheels());
	}
}
