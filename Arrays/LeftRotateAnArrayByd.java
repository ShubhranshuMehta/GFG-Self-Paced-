import java.util.*;

public class LeftRotateAnArrayByd{
	public static void main(String[] args){

	}

	public static void 1st(int[] arr, int n){
		for(int i=0; i<d;i++){
			leftRotateAnArrayby1(arr,n);
		}
	}

	public static void 2nd(int[] arr, int n){
		int temp[d];

		for(int i=0; i<d;i++){
			temp[i] = arr[i];
		}

		for(int i=d; i<n;i++){
			arr[i-d] = arr[i];
		}

		for(int i=0; i<d;i++){
			arr[n-d+i] = temp[i];
		}
	}

	public static void 3rd(int[] arr, int n){
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
	}

	public static int[] reverse(int[] arr,int n){
		int low=0;
		int high = n-1;

		while(low<high){
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}

		return arr;
	}
}

