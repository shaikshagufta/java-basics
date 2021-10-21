package superkey;

public class Animal {
	String colour="white";  
}  
class Dog extends Animal{  
	String colour="black";  
	void printColour(){  
		System.out.println(colour);
		System.out.println(super.colour);  
	}  
}  
class TestSuper1{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColour();  
	}
}
