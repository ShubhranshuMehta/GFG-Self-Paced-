import java.util.*:

public class Fibonacci{
	public static void main(String[] args){

	}

	public static int fibonacci(int n){
		if(n<1){
			return 0;
		}
		if(n==1){
			return 1;
		}

		return fibonacci(n-1)+fibonacci(n-2);
	}
}