import java.util.* ;
import java.io.*; 

class Solution {

	public static long Pow(int X, int N) {
		//Write your code here
		if(N==0)return 1;
		long temp = Pow(X,N/2);
		// if N is Odd
		if(N%2 ==1)
		return temp*temp*X;
		//if N is even
	 	return temp*temp;
		 
	}
}
