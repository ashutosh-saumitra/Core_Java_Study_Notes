package ExceptionHandling;

import java.util.Scanner;

import javax.xml.bind.DataBindingException;

class Scrap{
	Scanner sc = new Scanner(System.in);
	void Runtimedemo(){
		System.out.println("Runtime Exception Demo.");
		int a,b;
		String str=null;
		a = sc.nextInt();
		b = sc.nextInt();
		try{			
			System.out.println(a/b);			
			System.out.println(str.length());
		}
		catch(ArithmeticException ae ){
			System.out.println("Inside Arithmetic Exception");
			System.out.println("Printing StackTrace");
			ae.printStackTrace();
			System.out.println("Printing Message"+ae.getMessage());
		}
		catch(NullPointerException ne){
			System.out.println("Inside Arithmetic Exception");
			ne.printStackTrace();
		}
		catch(DataBindingException | ClassCastException dbe){
			dbe.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Inside Exception");
			e.printStackTrace();			
		}
		finally{
			System.out.println("Finally");
		}
		
	}
	void Driver(){
		Runtimedemo();
	}
}
public class ExceptionHandlingBasics {
	public static void main(String[] args) {
		Scrap scrap =new Scrap();
		scrap.Driver();
		/* 1- Exception - It is an abnormal condition in which the normal execution of code gets hampered.
		 * 2- Error - These are thrown by java runtime system and leads to an irrecoverable condition which occurs during the program execution
		 * 			- Once thrown by the system cannot recover from it and will come to an halt.
		 * 			- Errors need to be handled.
		 * Exception and its types:
		 * 1- Checked
		 * 2- Unchecked
		 * 
		 * 								 Object
		 * 				  					|
		 * 			   __________________Throwable_______________
		 * 		  	  /											 \			
		 * 			Error									  Exception_________
		 * 	->OutOfMemoryError								 /		   			\		
		 * 	->StackOverFlowError					 ___Built-in________		User-defined
		 * 	->AbstractMethodError					/				    \
		 * 					___________RuntimeException(Unchecked)		__Compiletime(Checked)
		 * 					->ArrayIndexOutOfBoundsException		->FileNotFoundExceptio
		 * 					->ArithmeticException					->InputOutputException
		 * 					->NullPointerException					->SQLException
		 * 					->ClassCastException.					->SocketException
		 *  				->DateTimeException.
		 * 	
		 * Exception keywords:
		 * 1- Try
		 * 		-> Cannot Standalone
		 * 		-> TRY can stand without Catch, but Catch cannot stand without TRY.
		 * 2- Catch
		 * 		->Cannot be used without TRY
		 * 		-> We can use multiple CATCH
		 * 		-> Multiple exceptions can be declared in a single catch block
		 * 3- Finally
		 * 		-> Gets executed at any condition
		 * 4- Throw
		 * 5- Throws
		 * 	
		 * Points:
		 * 	1- Narrower exceptions should be declared first
		 * 	2- Broader exception should be declared last.
		 * 			
		 * */
	}
}
