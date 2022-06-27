package ExceptionHandling;

import java.io.FileNotFoundException;

class RansomWare{
	int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
	void sum(){
		System.out.println("Throwing exception");
		throw new ArrayIndexOutOfBoundsException("Throw ArrayIndexOutOfBoundsException");
	}
	void action() {
		System.out.println(divide(2, 20));
		try{
			sum();
			
		}
		catch(ArrayIndexOutOfBoundsException a ){
			System.out.println(a.getMessage());
			//a.getMessage();
		}
		System.out.println("Checking return = "+checkReturn(5));
		
	}
	int checkReturn(int a){
		try{
			System.out.println("Example 1");
			//return a;
			System.exit(0);
			System.out.println("Example 2");
		}
		catch(ArithmeticException ae){
			return a*a;
		}
		finally{
			return a*a*a;
		}
	}
	
	protected void printClassName(){
		System.out.println(this.getClass().getSimpleName());
	}
}

class ChildClass extends RansomWare {
	@Override
	public void printClassName() throws FileNotFoundException /* error here because it's checked exception */{
		System.out.println(this.getClass().getSimpleName());
	}
}

public class ThrowThrowsKeyword {
	public static void main(String[] args) {
		RansomWare ransomWare =new RansomWare();
			ransomWare.action();
		/* Throws:
		 * -> After method name i.e. used in the signature of method to indicate that this method might throw one of the listed type exceptions
		 * -> The caller to these methods has to handle the exception using a try-catch block
		 * -> When an exception is found, it will throw the exception, and the control will go to the point from where the method was called.
		 * -> After the exception is found the rest of the code will not be executed.
		 * -> When we do not know that we may/may not have an exception in our program.
		 * -> The throws keyword is used for exception handling without try & catch block.
		 * -> It specifies the exceptions that a method can throw to the caller and does not handle itself.
		 * -> We can use throws keyword to delegate the responsibility of exception handling to the caller 
		 * 		(It may be a method or JVM) then caller method is responsible to handle that exception.  
		 * -> By the help of throws keyword we can provide information to the caller of the method about the exception.
		 * */
			
		/* Throw:
		 * -> It is used to throw an exception(checked/unchecked) explicitly in the code, inside the function or the block of code.
		 * -> Throw is used within the method and mainly used to throw custom exceptions.
		 * -> We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.
		 * */
		
		/* If the superclass method does not declare an exception, then subclass overridden method cannot declare the checked exception,
		 * but it can declare unchecked exception
		 * */
	}

}
