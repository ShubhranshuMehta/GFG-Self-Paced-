import java.util.*;

public class Palindrome{
	public static void main(String[] args){

	}

	static boolean palindrome(String str, int start, int end){
		if(start>=end){
			return true;

		}

		return((str.charAt(start)==str.charAt(end)) && (palindrome(str, start+1, end-1)));
	}
}