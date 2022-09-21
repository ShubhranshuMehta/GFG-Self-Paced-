import java.util.*;

public class MinimumConsecutiveFlips{
	public static void main(String[] args){

	}

	public static void minimumConsecutiveFlips(int[] arr, int n){
		for(int i = 1; i < n; i++){
			if(arr[i]!=arr[i-1]){
				if(arr[i]!=arr[0]){
					System.out.print("From "+i+" to ");
				}
				else{
					System.out.println(i);
				}
			}
		}
		if(arr[n-1]!=arr[0]){
			System.out.println(n-1);
		}
	}
}