package Encapsulation;

public class EncapsulationDemo extends Car12{
	public static void main(String[] args) {
		/*
		 * HAS-A Relation
		 * Access Modifiers:
		 * 1- Public:
		 * 		->Class, Variable, Method, Instance
		 * 		-> If any class is public
		 * 			->Inside the class
		 * 			->Outside the class
		 * 			->Outside the package
		 * 			->
		 * 		->One file can have only one public class
		 * 		->File name must be same as of the public class name.
		 * 		->main method can only be inside the public class
		 * 2- Private:
		 * 		->Class - NO
		 * 		->Variable - Yes
		 * 		->Methods - Yes
		 * 		->Can be accessed only within the class inside which it is defined.
		 * 		->Can be accessed outside the class using public methods.
		 * 3- Protected: (Protected means that it is protected within the package in any class and when it moves to a different class it becomes unprotected.)
		 * 		->Class - NO
		 * 		->Variable - Yes
		 * 		->Methods - Yes	
		 * 		->Can be accessed in any class within the package using Inheritance (IS-A & HAS-A)
		 * 		->Can be accessed in any class outside the package using IS-A relation only. (extend keyword only)
		 * 4- Abstraction/Aggregation
		 * 
		 * 5- Encapsulation:
		 * 		->By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.
		 * 		->It provides you the control over the data.
		 * 		->The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
					declare class variables/attributes as private
					provide public get and set methods to access and update the value of a private variable
				->Flexible: the programmer can change one part of the code without affecting other parts
				->Increased security of data
		 *			
		 * */
		
		
	}

}
