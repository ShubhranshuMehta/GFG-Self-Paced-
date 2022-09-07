import java.util.*;

public class ReverseAnArray{
	public static void main(String[] args) {

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