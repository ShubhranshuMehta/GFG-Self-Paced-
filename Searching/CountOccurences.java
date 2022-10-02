// In a sorted array, find the number of occurences of a character in log(n) time and not O(log(n)+k) time complexity
import java.util.*;

public class CountOccurences{
	public static void main(String[] args){

	}

	public static int countOccurences(int[] arr, int n, int x){
		int first = indexOfFirstOccurence(arr, k, 0, n-1);

		if(first==-1){
			return 0;
		}else{
			return (indexOfLastOccurence(arr, k, 0, n-1)-first+1);
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

	public static int indexOfLastOccurence(int[] arr, int k, int low, int high){
		if(low> high){
			return -1;
		}

		int mid = (low+high)/2;
		if(arr[mid]>k){
			high=mid-1;
			return indexOfLastOccurence(arr, k, low, mid-1);
		}else if(arr[mid]<k){
			return indexOfLastOccurence(arr, k, mid+1, high);
		}else{
			if(mid==n-1 || arr[mid+1]!=arr[mid]){
				return mid;
			}else{
				return indexOfLastOccurence(arr, k, low, mid+1);
			}
		}
	}
}

