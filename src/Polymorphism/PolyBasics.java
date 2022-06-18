package Polymorphism;

class Car201{
	void show1(){
		System.out.println("Parent Show-1.");
	}
	void show(){
		System.out.println("Parent Show.");
	}
	
}
/*class Car201{

}*/
class Ford201 extends Car201{
	void show(){
		System.out.println("Child Show.");
	}
	void show2(){
		System.out.println("Child Show-2.");
	}
}

public class PolyBasics {
	public static void main(String[] args) {
		/*
		 * Poly = many
		 * morphism = types/form
		 * 1- Overriding
			 * 	a->It is the basis for Polymorphism
			 * 	b->Only applicable for methods
			 *  c->Only applicable for the classes related with each other through Inheritance
			 *  d->We cannot decrease the access modifiers of any overriden methods
			 *  e->We can only Increase the access modifiers of any overriden methods
			 *  	->It means that overriden methods should not be  more restrictive.
			 *  f->Overriden methods should not throw new broader exception
			 *  g->Static cannot be overriden
			 *  h->Final cannot be overriden
			 *  i->Private cannot be overriden
			 *  
		 * 2-Overloading
		 	*  a->Only applicable for methods
		 	*  b->Only applicable between the methods of same class and its super class.
		 	*  c->Helps in polymorphism
		 	*  d->It allows to define more methods in same name, so that it gives more options to choose between the methods.
		 	*  e->Overloaded methods must change the argument list.
		 	*  f->Only changing the Return type of overloaded methods will not work 
		 	*  		https://www.javatpoint.com/method-overloading-in-java
		 	*  g->Overloaded methods can declare a new exception or broader exception or narrower exception
		 	*  h->Changing the order of the arguments will work in case of method overloading
		 	*  
		 * 
		 * */
		Ford201 ford201 = new Ford201();
		ford201.show();
		ford201.show1();
		System.out.println("Ford201 Object="+ford201.getClass().getSimpleName());
		
		Car201 car201 = new Car201();
		car201.show();
		System.out.println("Car201 Object="+car201.getClass().getSimpleName());
		
		Car201 car2012 = new Ford201(); //Upcasting is supported din java.
		car2012.show1();
		car2012.show(); //Runtime polymorphism.
		//car2012.show2();
		System.out.println("Car2012 Object="+car2012);
		
		//Ford201 ford2012 = new Car201(); //Child class cannot refer to parent class
		//Down casting not supported in java.
		//Explicit down casting is also not supported --> ClassCastException
		
		Ford201 ford2013 =   (Ford201)new Car201();
		ford2013.show();
		ford2013.show1();
		ford2013.show2();
		System.out.println("Ford2013 Object="+ford2013.getClass().getSimpleName());
		
	}
}
