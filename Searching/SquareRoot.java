import java.util.*;

public class SquareRoot{
	public static void main(String[] args){

	}

	public static int squareRoot(int x){
		int low=1,high=x,ans=-1;

		while(low<=high){
			int mid = (low+high)/2;
			int midSquare = mid*mid;
			if(mid==x){
				return mid;
			}
			else if(mid>x){
				high = mid-1;
			}
			else{
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}
}