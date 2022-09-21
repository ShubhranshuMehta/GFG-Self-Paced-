import java.util.*;

public class WindowSlidingTechnique{
	public static void main(String[] args){

	}


	// Given an unsorted array of non-negative integers, find if there is a subarray with given sum.
	public static boolean isSubSum(int[] arr, int n, int sum){
		int curr_sum=arr[0], s=0;

		for(int e=1;e<n;e++){
			while(curr_sum>sum && s<e-1){
				curr_sum-=arr[s];
				s++;
			}
			if(curr_sum==sum){
				return true;
			}
			if(e<n){
				cutt_sum+=arr[e];
			}
		}
		return(curr_sum==sum);
	}
}


// Other questions using Window Sliding Technique
	// 1. N-bonacci numbers; print first M N-bonacci Numbers
	// 2. Count distinct elements in every window of size K.  also using hashing