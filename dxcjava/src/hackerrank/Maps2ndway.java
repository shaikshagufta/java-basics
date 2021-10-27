package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps2ndway {
	//Complete this code or write your own from scratch

	public static void main(String []argh)
	{
		Map<String, Integer> mp = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();

		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();

			mp.put(name, phone);
		}

		while(in.hasNext())
		{
			String s=in.nextLine();
			if(mp.containsKey(s))
				System.out.println(s+"="+mp.get(s));
			else
				System.out.println("Not found");    
		}
	}
}
