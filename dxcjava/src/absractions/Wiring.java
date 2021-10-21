package absractions;

public class Wiring {
	public static void main(String[] args) {

		ISwitchBoardListener sListener = new HavellsAppliances();

		sListener.switchOne();
		sListener.switchTwo();
		sListener.switchThree(1);
		sListener.switchFour();
	}
}
