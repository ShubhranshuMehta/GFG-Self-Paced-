import java.util.*;

public class N{
	public static void main(String[] args){
		printN(10);
	}

	static void printN(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		printN(n-1);
	}
}