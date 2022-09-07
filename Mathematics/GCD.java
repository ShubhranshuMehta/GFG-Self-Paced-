import java.util.*;


// EUCLID ALGORITHM
public class GCD{
    public static void main(String[] args){
        
    }

    public static int GCD(int a, int b){
        int res = Math.min(a,b);

        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;
        }
        return res;
    }

    public static int GCDusingEuclidAlgorithm(int a, int b){
        // gcd(a,b) = gcd(a-b,b) if b<a
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }

    public static void GCDusingEuclidAlgorithm2(int a, int b){
        if(b==0){
            return a;
        }
        return GCDusingEuclidAlgorithm2(b, a%b);
    }

}

// this problem can also be use when we have to find the largest square tile with which we can tile a m*n floor