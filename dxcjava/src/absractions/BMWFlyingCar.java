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

}
