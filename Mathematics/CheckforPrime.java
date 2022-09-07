import java.util.*;

public class CheckforPrime{
    public static void main(String[] args){

    }

    public static boolean Prime(int a){
        if(a==1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(a);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean Prime2(int a){
        if(a==1){
            return false;
        }
        if(a==2 || a==3){
            return true;
        }

        if(a%2=0 || a%3==0){
            return false;
        }

        for(int i=2;i<=Math.sqrt(a);i+=6){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}