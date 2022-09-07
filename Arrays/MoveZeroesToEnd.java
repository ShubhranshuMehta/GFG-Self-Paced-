import java.util.*;

public class MoveZeroesToEnd{
	public static void main(String[] args){

	}

	public static int[] zeroes(int arr[], int n){
		int count=0;
		for(int i=0; i<n; i++){
			if(arr[i]!=0){
				swap(arr[i],arr[count]);
				count++;
			}
		}
		return arr;
	}
}