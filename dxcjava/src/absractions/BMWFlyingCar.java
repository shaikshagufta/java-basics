package absractions;

public class BMWFlyingCar extends FlyingCar{

	@Override
	public void stopCar() {
		System.out.println("switchoff propellors");

	}

	@Override
	public void flyCar() {
		System.out.println("switch on the propellers");

	}

	@Override
	public void landCar() {
		System.out.println("switch on landing gears");
	}


	public static	int add(int a, int b) {
		return a+b;
	}

	public static boolean isEligibletoVote(int age) {
		if (age >18) {return true;}
		return false;
	}

}
