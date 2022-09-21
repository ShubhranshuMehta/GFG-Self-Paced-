import java.util.*;

public class FrequenciesOfaSortedArray{
	public static void main(String[] args){
		int[] arr={10,10,10,30,30,40};
		frequency(arr,6);

	}

	public static void frequency(int[] arr, int n){
		int freq =1;
		for(int i=1; i<arr.length; i++){
			if(i<n && arr[i]==arr[i-1]){
				freq++;
			}else{
				System.out.println(arr[i-1]+" "+freq);
				freq=1;
			}

			if(i==n-1 && arr[n-1]==arr[n-2]){
				System.out.println(arr[n-1]+" "+freq);
			}

			if(i==n-1 && arr[n-1]!=arr[n-2]){
				System.out.println(arr[n-1]+" "+1);
			}

			
		}
	}
}