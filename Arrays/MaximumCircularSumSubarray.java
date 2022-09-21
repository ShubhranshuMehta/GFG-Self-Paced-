import java.util.*;

public class MaximumCircularSumSubarray{
	public static void main(String[] args){

	}

	public static int sumSub(int[] arr, int n){ //Kanade's Algoritm
		int res = arr[0];
		int maxEnding = arr[0];

		for(int i=0;i<n;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=max(res, maxEnding);
		}
		return res;
	}

	public static int maximumCircularSum(int[] arr,int n){
		int max_normal = sumSub(arr, n);

		if(max_normal<0){
			return max_normal;
		}

		int arr_sum = 0;

		for(int i=0;i<n;i++){
			arr_sum+=arr[i];
			arr[i]=-arr[i];
		}

		int max_circular = arr_sum+sumSub(arr,n);

		return Math.max(max_normal,max_circular);
	}
}