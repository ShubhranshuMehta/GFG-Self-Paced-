import java.util.*:

public class RepeatingElement{
	public static void main(string[] args){

	}

	public static int repeatingElement(int[] arr, int n){
		int slow=arr[0]+1, fast = arr[0]+1;

		do{
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
		}while(slow!=fast)

		slow= arr[0]+1;

		while(slow!=fast){
			fast=arr[fast]+1;
			slow=arr[slow]+1;
		}

		return slow;
	}
}