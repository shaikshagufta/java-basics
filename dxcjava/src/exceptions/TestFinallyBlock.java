package exceptions;

public class TestFinallyBlock {

	public static void main(String[] args) {
		//no exceptions by the below code
		try {
			int data = 25 / 5;
			System.out.println(data);
		} 

		//catch won't be executed
		catch (NullPointerException e)
		{
			System.out.println(e);
		}
		//executed even if there is no exception
		finally {
			System.out.println("finally block is always executed");
		}



		System.out.println("Rest of the code....");
	}
}
