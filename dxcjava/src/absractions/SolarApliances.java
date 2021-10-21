package absractions;

public class SolarApliances implements ISwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("Solar fan is on");
		
	}

	@Override
	public int switchTwo() {
		System.out.println("Solar ac is on");
		return 30;
	}

	@Override
	public boolean switchThree(int type) {
		System.out.println("Solar LED is on");
		return false;
	}

	@Override
	public void switchFour() {
		System.out.println("Solar bedlamp is on");
		
	}

}
