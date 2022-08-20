import java.util.*;

public class Palindrome{
	public static void main(String[] args){
		System.out.println(Palindrome(11));
	}

	public static Boolean Palindrome(int n){
		int temp = n;
		int res=0;
		while(temp>0){

			res = res*10 + (temp%10);
			temp/=10;
		}


		return (res == n);
	}
}
