// Index of first Occurence of a given element in a Sorted Array

import java.util.*;

public class IndexOfFirstOccurence{
	public static void main(String[] args){

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