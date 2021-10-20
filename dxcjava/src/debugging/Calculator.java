package debugging;

public class Calculator {

	public int add(int i, int j) {
		System.out.println("Calculator-- add");
		
		int c = i+j;
		System.out.println("Calculator-- add--"+c);
		return c;
	}
	public int sub(int i, int j) {
		return i-j;
	}
	public int mul(int i, int j) {
		return i*j;
	}
	public int div(int i, int j) {
		return i/j;
	}
}
