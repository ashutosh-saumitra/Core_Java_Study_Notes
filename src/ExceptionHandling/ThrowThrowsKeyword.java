package ExceptionHandling;

class RansomWare{
	int divide(int a, int b) throws ArrayIndexOutOfBoundsException{
		return a/b;
	}
	void action() throws Exception{
		System.out.println(divide(2, 0));
		
	}
}
public class ThrowThrowsKeyword {
	public static void main(String[] args) throws Exception {
		RansomWare ransomWare =new RansomWare();
			ransomWare.action();
		/* Throws:
		 * -> After method name
		 * -> As an exception is found, it will throw the exception, and the control will go to the point from where the method was called.
		 * -> After the exception is found the rest of the code will not be executed.
		 * -> When we do not know that we may/may not have an exception in our program.
		 * */
		/* Throw:
		 * 
		 * */
	}

}
