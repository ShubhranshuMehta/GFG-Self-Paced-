// majority element is the element which appears more than n/2 time in the array

import java.util.*;

public class MajorityElement{
	public static void main(String[] args){

	}

	public static int majorityElement(int[] arr, int n){ //Murray's Voting Algorithm 
		int res=0, count=1;

		for(int i=1;i<n;i++){
			if(arr[res]==arr[i]){
				count++;
			}
			else{
				count--;
			}
			if(count==0){
				res=i;
				count=1;
			}
		}

		count=0;

		for(int i=0;i<n;i++){
			if(arr[res]==arr[i]){
				count++;
			}

		}
		if(count <=n/2){
			res=-1;
		}
		return res;
	}
}