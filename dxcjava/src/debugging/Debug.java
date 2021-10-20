package debugging;

public class Debug {
	public static void main(String[] args) {
		System.out.println("DebugDemo-- main");
		Calculator calculator = new Calculator();
		int sum = calculator.add(10, 20);
		System.out.println("the sum is--"+sum);
		
		for(int a=0; a<5; a++) {
			int f = a+ 5* 3;
		}
}

}
