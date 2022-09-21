import java.util.*;

public class TrappingRainWater{
	public static void main(String[] args){

	}

	public static int getWater1(int[] arr, int n){
		int res=0;

		for(int i=1; i<n-1; i++){
			int lmax =arr[i];
			int rmax=arr[i];

			for(int j=0; j<i; j++){ //get the left max greater than arr[i]
				if(arr[j]>lmax){
					lmax = arr[j];
				}
			}

			for(int j=i+1; j<n; j++){ //get the right max greater than arr[i]
				if(arr[j]>rmax){
					rmax = arr[j];
				}
			}

			res +=(Math.min(lmax,rmax)-arr[i]);
		}
		return res;
	}




	public static int getWater2(int[] arr, int n){

		int res = 0;
		int lmax[n],rmax[n];

		lmax[0] = arr[0];
		for(int i=1; i<n; i++){
			lmax[i] = Math.max(lmax[i-1],arr[i]);
		}

		rmax[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--){
			rmax[i]=max(arr[i],rmax[i+1]);
		}

		for(int i=0;i<n-1; i++){
			res+=(Math.min(lmax[i],rmax[i])-arr[i]);
		}
		return res;
	}
}