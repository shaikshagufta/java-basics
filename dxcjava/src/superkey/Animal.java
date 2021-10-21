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

