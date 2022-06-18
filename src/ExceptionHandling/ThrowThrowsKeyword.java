package ExceptionHandling;

class RansomWare{
	int divide(int a, int b) throws ArrayIndexOutOfBoundsException{
		return a/b;
	}
	void action() throws Exception{
		divide(2, 0);
		try{
			
		}
		catch(Exception g){
			
		}
	}
}
public class ThrowThrowsKeyword {
	public static void main(String[] args) {
		RansomWare ransomWare =new RansomWare();
		try{
			ransomWare.action();
		}
		catch(ArithmeticException | NullPointerException e){
			e.printStackTrace();
		}
		catch(Exception aen){
			aen.printStackTrace();
		}
		/* Throws:
		 * -> After method name
		 * -> As an exception is found, it will throw the exception, and the control will go to the point from where the method was called.
		 * -> After the exception is found the rest of the code will not be executed.
		 * -> When we do not know that we may/may not have an exception in our program.
		 * */
	}

}
