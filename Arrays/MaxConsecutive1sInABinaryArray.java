import java.util.*;

public class MaxConsecutive1sInABinaryArray{
	public static void main(String[] args){

	}

	public static int consecutive1sInABinary(int[] arr){
		int res=0, curr=0;

		int n = arr.length;

		for(int i=0; i<n; i++){
			if(arr[i]==0){
				curr=0;
			}
			else{
				cur++;
				res = Math.max(res, curr);
			}
		}
		return res;
	}
}