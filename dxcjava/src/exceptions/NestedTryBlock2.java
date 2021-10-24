package exceptions;

public class NestedTryBlock2 {

	public static void main(String[] args) {

		//main try block
		try {
			//inner try block1
			try {
				//inner try block2
				try {

					int arr [] = {1,2,3,4};

					//printing the array element out of its bound
					System.out.println(arr[10]); 

				} 
				//handles arithmetic exception 
				catch (ArithmeticException e)
				{
					System.out.println("Arithmetic exception");
					System.out.println("inner try block 1");
				}
			} 
			//handles arithmetic exception
			catch (ArithmeticException e)
			{
				System.out.println("Arithmetic exception");
				System.out.println("inner try block 2");
			}
		}
		//handles ArrayIndexOutOfBoundsException
		catch (ArrayIndexOutOfBoundsException e4)
		{
			System.out.println(e4);
			System.out.println("inner try block 3");
		}
		catch (Exception e5)
		{
			System.out.println("Exception");
			System.out.println("handled in main try block");
		}

	}

}
