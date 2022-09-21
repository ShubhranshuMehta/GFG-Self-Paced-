import java.util.*;

public class MaximumDifferencePossible{
	public static void main(String[] args){

	}

	public static int macDifference(int[] arr, int n){
		int res = arr[1]-arr[0];
		int minval = arr[0];

		for(int i=0;i<n;i++){
			res = Math.max(res, arr[j]-minval);
			minval = Math.min(minval, arr[i]);
		}

		return res;
	}
}