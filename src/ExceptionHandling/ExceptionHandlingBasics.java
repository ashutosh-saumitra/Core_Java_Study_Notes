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
			try{
				System.out.println(str.length());
			}
			catch(NullPointerException ne){
				System.out.println("Inside NullPointer Exception-2");
				ne.printStackTrace();
			}
			finally{
				System.out.println("Finally-2");
			}
			
		}
		catch(ArithmeticException ae ){
			System.out.println("Inside Arithmetic Exception-1");
			System.out.println("Printing StackTrace-1:");
			ae.printStackTrace();
			System.out.println("Printing Message : "+ae.getMessage());
			try{
				System.out.println(str.length());
			}
			catch(NullPointerException ne){
				System.out.println("Inside NullPointer Exception-3");
				ne.printStackTrace();
			}
			finally{
				System.out.println("Finally-3");
			}
		}
		catch(NullPointerException ne){
			System.out.println("Inside NullPointer Exception-1");
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
			System.out.println("Finally-1");
			try{
				System.out.println(str.length());
			}
			//System.out.println("Hello");
			catch(NullPointerException ne){
				System.out.println("Inside NullPointer Exception-4");
				ne.printStackTrace();
			}
			//System.out.println("Hello");
			finally{
				System.out.println("Finally-4");
			}
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
		 * 1- TRY
		 * 		-> Cannot Standalone || Anyone among CATCH/FINALLY is required for a TRY block.
		 * 		-> TRY can stand without CATCH, but CATCH cannot stand without TRY.
		 * 		-> TRY can stand without FINALLY, but FINALLY cannot stand without TRY.
		 * 		-> The code which might throw an exception is kept inside TRY block.
		 * 2- Catch
		 * 		-> Cannot be used without TRY
		 * 		-> We can use multiple CATCH
		 * 		-> Multiple exceptions can be declared in a single catch block
		 * 		-> The catch block can have the code to handle the exception or log the message.
		 * 3- Finally
		 * 		-> Gets executed at any condition
		 * 		-> It can be used to clean up the code or release the resources that were utilized in the program.
		 * 		-> Only one Finally for one TRY block.
		 * 		-> It is optional.
		 * 4- Throw
		 * 5- Throws
		 * 	
		 * Important Points:
		 * 	1- Narrower exceptions should be declared first
		 * 	2- Broader exception should be declared last.
		 *  3- Inside TRY block we can use TRY, CATCH, FINALLY
		 *  4- Inside CATCH block we can use TRY, CATCH, FINALLY
		 *  5- Inside FINALLY block we can use TRY, CATCH, FINALLY
		 *  6- As soon as an exception is thrown the rest of the code in the TRY block is skipped, and the control directly goes to CATCH block.
		 *  7- There should not be any statement between TRY, CATCH and FINALLY.
		 * 			
		 * */
	}
}
