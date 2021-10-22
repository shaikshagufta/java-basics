package exceptions;

public class TestFinally {

	public static void main(String[] args) {

		try {
			int data =25/5;
			System.out.println("the dat is "+data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally the block got executed");
		}
	}
}
