import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5,6};
		System.out.println(binarySearchRecursive(arr,4, 0, 4));
	}

	public static int binarySearchIterative(int[] arr, int n, int k){
		int high=n-1, low = 0;
		int mid;

		while(high>=low){
			mid = (high+low)/2;
			if(arr[mid]==k){
				return mid;
			}

			if(arr[mid]>k){
				high=mid-1;
			}else{
				low = mid+1;
			}
		}
		return -1;
	}

	public static int binarySearchRecursive(int[] arr, int k, int low, int high){
		if(low>high){
			return -1;
		}

		int mid = (low+high)/2;

		if(arr[mid] == k){
			return mid;
		}
		if(arr[mid]>k){
			return binarySearchRecursive(arr, k, low, mid-1);
		}else{
			return binarySearchRecursive(arr, k, mid+1, high);
		}
	}
}

// This Approach has log(n) time complexity.