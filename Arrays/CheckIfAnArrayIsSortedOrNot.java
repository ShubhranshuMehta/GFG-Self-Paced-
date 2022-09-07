import java.util.*;

public class CheckIfAnArrayIsSortedOrNot{
	public static void main(String[] args){

	}

	public static boolean isSorted(int arr[], int n){
		for(int i=1;i<n;i++){
			if(arr[i]<arr[i-1]){
				return false;
			}
		}
		return true;
	}
}