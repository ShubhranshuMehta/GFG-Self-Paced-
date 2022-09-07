import java.util.*;

public class RopeCuttingProblem{
	public static void main(String[] args){

	}

	static int ropeCutting(int n, int a,int b, int c){
		if(n==0){
			return 0;
		}
		if(n<0){
			return -1;
		}

		int res = Math.max(ropeCutting(n-a,a,b,c),ropeCutting(n-b,a,b,c),ropeCutting(n-c,a,b,c));

		if(res<0){
			return -1;
		}

		return res+1;
	}
}