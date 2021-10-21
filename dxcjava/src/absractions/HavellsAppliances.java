package absractions;

public class HavellsAppliances implements ISwitchBoardListener {

	@Override
	public void switchOne() {
		System.out.println("hawells fan is on");
		
	}

	@Override
	public int switchTwo() {
		System.out.println("hawells ac is on");
		return 21;
	}

	@Override
	public boolean switchThree(int type) {
		System.out.println("havells LED is on");
		return false;
	}

	@Override
	public void switchFour() {
		System.out.println("havells bedlamp is on");
		
	}

}
