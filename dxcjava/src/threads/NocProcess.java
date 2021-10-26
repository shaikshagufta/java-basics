package threads;

public class NocProcess extends Thread {

	public static void main(String[] args) {

		oldSequentialWay();
	}

	private static void oldSequentialWay() {
		try{
			//fee
		Thread.sleep(5000);
		System.out.println("got the fee no due stamp");
		//hostel
		Thread.sleep(5000);
		System.out.println("got the fee no due stamp");
		//transport
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
		//library
		Thread.sleep(500);
		System.out.println("got the fee no due stamp");
    }
	catch(Exception e) {
    }
	}
}
		

