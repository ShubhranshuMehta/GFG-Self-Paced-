import java.util.*;

public class PrimeFactors{
    public static void main(String[] args){

    }

    public static void PrimeFactors(int n){
        if(n<=1){
            return;
        }

        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i);
                n=n/i;
            }
        }

        if(n>1){
            print(n);
        }

    }

}