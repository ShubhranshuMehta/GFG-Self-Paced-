import java.util.*;

public class MaximumSumSubarray{
	public static void main(String[] args){

	}

	public static int sumSub(int[] arr, int n){ //Kadabe's Algoritm
		int res = arr[0];
		int maxEnding = arr[0];

		for(int i=0;i<n;i++){
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
			res=max(res, maxEnding);
		}
		return res;
	}
}