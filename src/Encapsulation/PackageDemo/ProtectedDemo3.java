package Encapsulation.PackageDemo;

import Encapsulation.ProtectedDemo2;

class Demo4 {
	static void print(){
		ProtectedDemo2 demo2=new ProtectedDemo2();		
		System.out.println(demo2.getNose());//Accessing public members with object without inheritance
		//System.out.println(demo2.getEyes());//Unable to access protected members with object and without inheritance
		//System.out.println(demo2.getEyes());//Unable to access private members with object and without inheritance
		}
}
public class ProtectedDemo3 extends ProtectedDemo2{
	public static void main(String[] args) {
		ProtectedDemo3 demo3 = new ProtectedDemo3();
		demo3.setEyes(23); //Accessing protected method outside the package but after inheriting it.
		System.out.println(demo3.getEyes());//Accessing protected method outside the package but after inheriting it.
		Demo4.print();
	}

}
