import java.util.*;

public class SubsetSumProblem{

	public static void main(String[] args){

	}

	public static int subsetSumProblem(int arr[],int n, int sum){
		if(n==0){
			if(sum==0){
				return 1;
			}else{
				return 0;
			}
		}

		return subsetSumProblem(arr,n-1,sum)+subsetSumProblem(arr,n-1,sum-arr[n-1]);

	}
}