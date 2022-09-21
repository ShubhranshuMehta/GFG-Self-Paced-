import java.util.*;

public class MaximumSubarraySumofLengthK{
	public static void main(String[] args){
		int[] arr={1, 8, 30, -5, 20, 7};
		System.out.println(max(arr, 6, 3));
	}

	public static int max(int[] arr, int n, int k){ //Using Window Sliding Technique
		int curr_sum=0, max =0;
		int i=0;

		for(int j=0;j<n;j++){
			curr_sum+=arr[j];

			if(j-i==k-1){
				if(curr_sum>max){
					max=curr_sum;
				}
				curr_sum-=arr[i];
				i++;
			}
		}
		return max;

	}
}