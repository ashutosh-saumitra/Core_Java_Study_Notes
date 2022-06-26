package StringDemo;

class Demo{
	void StringDeclaration(){
		//Using Literal
		String name1 = "Karan";
		String name2 = "Karat";
		System.out.println("1-"+name1);
		System.out.println("2-"+name2);
		System.out.println(name1==name2);
		System.out.println("4-"+name1.equals(name2));
		
		//Using NEW keyword
		String name3 = new String("Sachin");
		String name4 = new String("Sachin");
		System.out.println("5-"+name3);
		System.out.println("6-"+name4);
		System.out.println(name3==name4);
		System.out.println("8-"+name3.equals(name4));
		
		//No data string but it takes memory
		String name5 = "";
		String name6 = null;
		System.out.println("9-"+name5);
		System.out.println("10-"+name6);
		System.out.println(name5==name6);
		System.out.println("12-"+name5.equals(name6));	
		System.out.println(name5.length());
		//System.out.println(name6.length());
		
		
	}
	void StringMethods(){
		String str1 = "My name is virus ";
		String str2 = "boy";
		System.out.println("1-"+str2.length());
		System.out.println("2-"+str1.charAt(2+2));
		System.out.println("3-"+str1.concat(str2));
		String str3 = str2.intern();
		System.out.println("4-"+str3);
		System.out.println("5-"+str1.hashCode());
		System.out.println("6-"+str2.hashCode());
		System.out.println("7-"+str3.hashCode());
		String str4 = "";
		System.out.println("8-"+str2.isEmpty());
		System.out.println("9-"+str4.isEmpty());
		String str5 = str3.replace('b', 'C');
		System.out.println("10-"+str5);
		String str6[] = str1.split(" ");
		System.out.println("11-"+str6[3]);
		for(int i=str6.length-1;i>=0;i--){
			System.out.print(str6[i]+" ");
		}
		System.out.println("\n13-"+str1.substring(3));
		System.out.println("14-"+str1.substring(3,9));
		System.out.println("15-"+str2.toUpperCase());
		System.out.println("16-"+String.join("*", str6));
		System.out.println("17-"+String.join("#", "Gadget","Boy"));
		String str7 = "     Madan     ";
		System.out.println("18-"+str7);
		System.out.println("19-"+str7.trim());
		String str8 = "abcd";
		String str9 = "zbcd";
		System.out.println("19-"+str8.compareTo(str9));
		//0 - if length is same and characters are same
		
	}
	void driver(){
		//StringDeclaration();
		StringMethods();
	}
}
public class StringBasics {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.driver();
		/* 1- String memory is created in SCP(String Constant Pool / String Literal Pool) when it is name1 syntax.
		 * 2- String memory is created in Heap when it is name3 syntax.
		 * 3- Declaration  ==> StringDeclaration();
		 * 		1- name1 and name2:
		 * 			1- will have only 1 reference created in SCP.
		 * 			2- Memory saved
		 * 			3- Compile time memory allocation.
		 * 		2- name3 and name4:
		 * 			1- two reference will be created
		 * 			2- Memory wastage
		 * 		3- name5 and name6:
		 * 			1- name5 has no data, but takes memory. It's length will be zero;
		 * 			2- name6 has no data and takes no memory. If we print it's size we will get NullPointerException.
		 * 4- "==" double equals to operator:
		 * 			1- Make comparison between two strings on the basis of their memory address.
		 * 5- "equals() method"
		 * 			1- Comparison based on the two string values.
		 * 			2- Comparison is based on character-by-character 
		 * 6- "compareTo() method"
		 * 			1- If the first string is lexicographically greater than the second string then it return a positive number(difference of character value).
		 * 			2- If the first string is lexicographically less than the second string then it return a negative number(difference of character value).
		 * 			3- If the first string is lexicographically equals to the second string then it return a zero.
		 * */

	}

}
