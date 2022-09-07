import java.util.*;

public class OperationsOnArrays{
	public static void main(String[] args){

	}

	// 1. Search
	int search(int arr[], int n, int x){

		for(int i=0; i<n; i++){
			if(arr[i]==x){
				return i;
			}
		}
		return -1;
	}

	// 2. Insert(only if the given array has some extra space)
	int insert(int arr[], int n, int x, int capacity, int position){
		if(n==capacity){
			return n;
		}

		int index = position-1;
		for(int i=n-1;i>=index;i++){
			arr[i+1] = arr[i];
		}
		arr[index]=x;

		return n+1;
	}

	// 3. Insert in a dynamic sized array
	// Dynamic Arrays insert at the end takes O(1) time complexity.
	// Dynamic Arrays initially give an array of size n and whenever the number of items increases from n, they make an array of *double* the size and *copy* all the elements from the initial array.

	
}