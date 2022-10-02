import java.util.*;

public class Count1sInABinarySortedArray{
	public static void main(String[] args){

	}

	public static int count1sInABinarySortedArray(int[] arr, int n){
		int first = indexOfFirstOccurence(arr, 1, 0, n-1);
		if(first==-1){
			return 0;
		}
		else{
			return(n-first);
		}
	}

	public static int indexOfFirstOccurence(int[] arr, int k, int low, int high){
		if(low> high){
			return -1;
		}

		int mid = (low+high)/2;
		if(arr[mid]>k){
			high=mid-1;
			return indexOfFirstOccurence(arr, k, low, mid-1);
		}else if(arr[mid]<k){
			return indexOfFirstOccurence(arr, k, mid+1, high);
		}else{
			if(mid==0 || arr[mid-1]!=arr[mid]){
				return mid;
			}else{
				return indexOfFirstOccurence(arr, k, low, mid-1);
			}
		}
	}
}