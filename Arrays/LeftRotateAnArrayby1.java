import java.util.*;

public class leftRotateAnArrayby1{
	public static void main(String[] args){

	}

	public static void leftRotateAnArrayBy1(int arr[], int n){
		int temp = arr[0];

		for(int i=1; i<n; i++){
			arr[i-1]=arr[i];
		}

		arr[n-1]= temp;
	}



}