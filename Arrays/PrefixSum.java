import java.util.*;

public class PrefixSum{
	public static void main(String[] args){

	}

	// Given a fixed array and multiple queries of following types on the array, how to efficiently perform these quesries.

	// here we first find the prefix sum array
	// and then use thhat to calculate the sum from l to r.
	public static int prefixSum(int[] arr, int n, int l, int r){
		int prefix_sum[n];

		prefix_sum[0] =arr[0];
		for(int i = 1; i < n; i++){
			prefix_sum[i] = prefix_sum[i-1]+arr[i];
		}

		if(l!=0){
			return(prefix_sum[r]-prefix_sum[l-1]);
		}else{
			return(prefix_sum[r]);
		}
	}

	// Given an array of integers, find if it has an equilibrium point
	public static boolean equilibriumPoint(int arr[], int n){
		int sum=0;
		for(int i=0; i<n; i++){
			sum+=arr[i];
		}

		int lsum=0;
		for(int i=0; i<n; i++){
			if(lsum==(sum-arr[i])){
				return true;
			}
			lsum+=arr[i];
			sum-=arr[i];
		}
		return false;
	}
}