import java.util.*;

public class RemoveDuplicatesInASortedArray{
	public static void main(String[] args){

	}

	public stativ int removeDuplicates{
		int res=1;

		for(int i=1; i<n; i++){
			if(arr[i]!=arr[res-1]){
				arr[res] = arr[i];
				res++;
			}
		}

		return res;
	}
}