class A{
	static int a=10;	
	static void show1(){		
		System.out.println("inside show1");
		System.out.println("a="+ a);
		a++;
	}
}
//a=10//a=11
class B{
	int var11=123;
	void show2(){
		System.out.println("inside show2");
		System.out.println("a="+A.a);
		System.out.println("var11="+var11);
	}
	void show3(){
		System.out.println("inside show3");
		System.out.println("var11="+var11);//123 //123
		var11++;//124 //124
	}
	void typeCasting(){
		//Type Casting
		//1-Implicit - Small PDT convert Large PDT
		byte b =100;
		int a=b;
		System.out.println(a);
		/*Primitve DT
		Byte, Short,int,Long...
		*/
		//2-Explicit
		//Large PDT convert to Small PDT
		int x =200;
		byte c=(byte)x;
		System.out.println(a);
	}
	
}

public class StaticExample {
	public static int var1=20;
	int var2=345;
	public static void main(String[] args) {		
		B obj = new B();
		obj.show2();
		obj.typeCasting();
		//Range : 256 == -128 to 0 to +127
		/*
			Static:
			1-> methods + variables
			2-> Inner classes
			3-> Static Variable get memory at compile time.
			4-> Static Method gets memory at run time.
			5-> variable cannot be static inside static methods
			6-> Static variable + method can directly be called in any static method.
			7-> non-static member can be called in any of the static methods by the name of the instance.
			8-> non-static member can not be referenced in static context without using its object.
			9-> static member ( variable + method) can be directly called using their class names.
			**10-> only one copy of static member can be formed by JVM.
			11->Static members can directly call by their class name.
			12->super() cannot be called in Static method.
		*/
		//static int var2;
		System.out.println(var1);
		var1 ++;
		System.out.println("Hello="+var1);
		
		System.out.println();
		System.out.println(A.a);
		A.show1();
		//show3();
		
		//Point 10 explanation:		
		A obj1 = new A();
		A obj2 = new A();	
		System.out.println(obj1);
		System.out.println(obj2);
		obj1.show1();
		obj2.show1();
		
		B obj3 = new B();
		B obj4 = new B();		
		obj3.show3();
		obj4.show3();
 }
}
