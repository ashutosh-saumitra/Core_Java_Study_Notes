package Abstraction;

abstract class Address{
	//abstract int a;//cannot have abstract variables	
	abstract void showName();
	void showAddress(){
		System.out.println("My Address");
	}
}
class Name extends Address{
	@Override
	void showName() {
		// TODO Auto-generated method stub
		System.out.println("Virus Boy");
	}	
}
abstract class State{
	abstract void StateName();
}
abstract class Country extends State{
	abstract void CountryName();
	void show2(){
		System.out.println("Inside abstract Country class");
	}
	
}
class Colony extends Address{

	@Override
	void showName() {
		// TODO Auto-generated method stub
		System.out.println("Colony -> extends Address");
	}
	
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Address address = new Address() {			
			@Override
			void showName() {
				// TODO Auto-generated method stub
				System.out.println("Madan");
			}
		};
		address.showAddress();
		Name name = new Name();
		name.showName();
		name.showAddress();
		State state = new State()
		{
			
			@Override
			void StateName() {
				// TODO Auto-generated method stub
				System.out.println("Jharkhand");
			}
		};
		state.StateName();
		Country country = new Country() {
			@Override
			void StateName() {
				// TODO Auto-generated method stub
				
			}

			@Override
			void CountryName() {
				// TODO Auto-generated method stub
				
			}	
			
		};
		country.StateName();
		Country country2 = new Country() {
			
			@Override
			void StateName() {
				// TODO Auto-generated method stub
				
			}

			@Override
			void CountryName() {
				// TODO Auto-generated method stub
				System.out.println("Inside anonymous class Country");
				
			}
			void show2(){
				System.out.println("Inside anonymous class Country Show2()");
			}
		};
		System.out.println("country="+country);
		System.out.println("country2="+country2);
		country2.show2();
		
		//Colony is a non-abstract class.
		Colony colony = new Colony();
		System.out.println("colony="+colony);
	
	}	
}
