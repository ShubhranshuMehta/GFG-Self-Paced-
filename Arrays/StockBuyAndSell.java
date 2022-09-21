import java.util.*;

public class StockBuyAndSell{
	public static void main(String[] args){
		int[] arr = {1, 5, 3, 1, 2, 8};
		System.out.println(stock(arr, 6));
	}

	public static int stock(int[] arr, int n){
		int min = arr[0];
		int max = arr[0];
		int res=0;

		for(int i = 1; i < n; i++){
			if(arr[i]<max){
				res = res + max-min;
				min = arr[i];
				max = arr[i];
			}
			else{
				max = arr[i];
			}
		}
		res +=(max-min);
		return res;
	}
}