import java.util.*;

public class JosephusProblem{
	public static void main(String[] args){

	}

	public static int josephusProblem(int n, int k){
		if(n==1){
			return 0;
		}

		return((josephusProblem(n-1,k)+k)%n);
	}
}