package absractions;

public abstract class FlyingCar {

	public  void startCar() {
		System.out.println("insert the key into the ignition and twist");
	};
	
	public abstract  void stopCar();
	public abstract  void flyCar();
	public abstract  void landCar();
}
