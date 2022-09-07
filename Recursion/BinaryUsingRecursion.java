import java.util.*;

class Binary{
	public static void main(String[] args){
		toBinary(10);
	}

	static void toBinary(int n){
		if(n==0){
			return;
		}
		toBinary(n/2);
		System.out.println(n%2);
	}
}