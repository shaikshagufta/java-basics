package debugging;

public class Debug {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.add(10, 20);
		System.out.println("the sum is--"+sum);
}

}
