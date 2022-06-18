class A1{
	int a,b;
	A1(int x, int y){
		a=x;
		b=y;
		//return var;		
	}
}
public class ConstructorDemo {
	
	public static void main(String[] args) {
		/*
		 * 1-Same name as that of a class
		 * 2-It returns the instance of the class to which it belongs. 
		 * 3-By default every java class has a Constructor --> done by JVM
		 * 4-We cannot specify return type of a Constructor
		 * 5-Returning vale from a constructor is called the "Reference id" which is decided by JVM.
		 * 6-Internally static in nature
		 * 7-can only be called using the keyword "new"
		 * 8-multiple constructors with different parameters.
		 * 9-Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
		 * 10-Default constructor is public in nature.
		 * 11-Constructor is the first block of code which executes when an object is created.
		 * 12-Constructor executes only once in the object life cycle
		 * 13-Our compiler gives us a default constructor(no-args constructor) which is created/made by compiler/JVM, only if we do not have any user-defined constructor.
		 * 14-Constructor has no return type(By default it has Class type return type). 
		 * */
		// = equals to is an Assignment operator
		final A1  obj1 = new A1(10,20);
		System.out.println(obj1);
		
		A1  obj2 = new A1(10,20);
		System.out.println(obj2);
		
		//obj1=obj2;
		System.out.println(obj1);
		
	}
}
