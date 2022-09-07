import java.util.*;

public class LargestElementInArray{
	public static void main(String[] args){

	}

	public static int largest(int arr[], int n){
		int res=0;
		for(int i=0; i<n; i++){
			if(arr[i]>arr[res]){
				res=i;
			}
		}
		return res;
	}

	public static int secondLargest(int arr[], int n){
		int res=-1;
		int largest=0;

		for(int i=1; i<n; i++){
			if(arr[i]>arr[largest]){
				res=largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest]){
				if(res==-1 || arr[i]>res){
					res = i;
				}
			}
		}
		return res;

	}
}