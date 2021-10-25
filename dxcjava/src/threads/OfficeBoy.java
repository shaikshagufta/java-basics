package threads;

public class OfficeBoy extends Thread {
	
	public void run() {

	try {
		Thread.sleep(3000);
		System.out.println("getting water");
	} 
	catch (Exception e) 
	{
		// TODO: handle exception
	}
	}
}
