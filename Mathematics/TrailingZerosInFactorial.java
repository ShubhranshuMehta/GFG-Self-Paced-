import java.util.*;

public class TrailingZerosInFactorial{
	public static void main(String[] args){
        System.out.println(zeros(6));
	}

	public static int zeros(int n){
		int res=0;
		for(int i=5;i<=n;i*=5){
			res+=(n/i);
		}
		return res;
	}
	// O(log n)
}