import java.util.*;

public class Factorial{
	public static void main(String[] args){

	}

	static int factorial(int n){
		if(n==1){
			return 1;
		}
		return(n*factorial(n-1));
	}
}