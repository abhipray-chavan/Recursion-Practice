
import java.util.*;
class Solution {



	static int fact(int n ){
		if(n==0)
		return 1;

		int pans = fact(n-1);
		return n*pans;
	}
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();

		if(n<0)
		System.out.println("Error");
		else
		System.out.println(fact(n));
		
	}
}
