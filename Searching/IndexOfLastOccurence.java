// Index of last Occurence of a given element in a Sorted Array

import java.util.*;

public class IndexOfLastOccurence{
	public static void main(String[] args){

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