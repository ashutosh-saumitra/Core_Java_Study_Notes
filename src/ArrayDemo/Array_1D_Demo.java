package ArrayDemo;
class Array_demo{
	public static int i=0;
	void OneDArrayDeclaration(){
		int[] arr1 = new int[100];
		float arr2[] = new float [100];
		int arr3[] = new int[]{1,2,3,4,5};
		char arr4[] = null;
		arr4= new char[5];
		int arr5[] = {1,2,3,5,4};	
		int arr6[] = {};
		char arr7[] = new char[]{'a','b','c'};
		
		//For-each Loop || Enhanced For loop
		/*for(int i:arr3){
			System.out.println(i);
		}*/
		
		System.out.println("Hello "+i);
		i++;
		
	}
	void randomValue (){
		//3 digits round off
		//By default Random method has Double Return Type
		int y= (int)(Math.random()*10000);
		System.out.println ("Rounded value = "+y);
	}
	void action(){
		OneDArrayDeclaration();
		randomValue();
	}
}
public class Array_1D_Demo {
	public static void main(String[] args) {
		Array_demo array_demo = new Array_demo();
		array_demo.action();
		//Array of class type Data type.
		/*Array_demo arr01[] = new Array_demo[5];
		for(int i=0;i<5;i++){
			arr01[i]= new Array_demo();
		}
		for(int i=0;i<5;i++){
			arr01[i].action();
		}*/
		/*
		 * Array is:
		 * 	1- An array is a container object that holds a fixed number of values of a single type
		 * 	2- If empty space exist - Memory wastage
		 ***3- index starts from 0
		 * 	4- Random access of any index
		 *  5- Insertion/ deletion -> we dont have any default/in-built methods.
		 *  6- Cannot be printed directly (except character Array)
		 *  7- If we directly print an array (without loop) then it will print its starting memory location/address.
		 *  8- We can create array of any data type - PDT, Class, Object etc..
		 * 
		 * Operations in Array:
		 * 	1- Insertion at a particular position
		 * 	2- Deletion from a particular position
		 * 	3- Sorting
		 * 	4- Searching
		 * 	5- Copying
		 * 	6- Equality
		 * 
		 * */
	}

}
