import java.util.*;

public class NumberOfDigits{
	public static void main(String[] args){

	}

	public static int countDigit(int n){
		if(n==0){
			return 0;
		}
		return 1+countDigit(n/10);
	}

	public static int countDigit2(int n){
		return floor(log10(n)+1);
	}
}

