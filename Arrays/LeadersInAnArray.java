// An element is called a leader if there is no  one in the array greater than it on it's right hand side

import java.util.*;

public class LeadersInAnArray{
	public static void main(String[] args){

	}

	public static void leaders(int[] arr, int n){
		int curr_leader = arr[n-1];

		System.out.println(curr_leader);

		for(int i=n-2;i>=0;i--){
			if(curr_leader<arr[i]){
				curr_leader=arr[i];
				System.out.println(curr_leader);
			}
		}
		

	}
}