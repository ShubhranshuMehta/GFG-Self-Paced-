// here we use recursion by taking the top n-1 diaks as a group and move them to b, them we move the last one to c and repeat the previous steps to move n-1 from b to c using a as  an auxiliary

import java.util.*;

public class TowerOfHanoi{
	public static void main(String[] args){

	}

	public static void Hanoi(int n, char a, char b, char c){
		if(n==1){
			System.out.println("Move 1 from "+a+" to "+c);
		}

		Hanoi(n-1, a, c, b);
		System.out.println("Move "+ n +" from "+a + " to "+c);
		Hanoi(n-1, b,a,c);
	}
}