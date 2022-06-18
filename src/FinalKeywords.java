
public class FinalKeywords {
	public static void main(String[] args) {
		//Non-Access Modifiers
		/*	FINAL
		 * 1-Class, Variables, methods, Instances 
		 * 2-Declaration and Initialization at the same time.
		 * 2-Final class cannot be uses as a super class
		 * 3-Final class cannot be extended
		 * 4-Final variables value cannot be changed
		 * 5-Final method cannot be overridden
		 * 6-A PDT/ object, its reference will not change its value.
		 * 7-to make members constant.
		 * */
		final int a=10;
		System.out.println(a);
		int b=20;
		System.out.println(b);
		a=b;
	}

}
