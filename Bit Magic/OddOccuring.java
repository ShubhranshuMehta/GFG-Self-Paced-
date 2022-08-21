import java.util.*;

public class OddOccuring {

    // we use the propery of XOR
    // x^0 = x;
    // x^y = y^x;
    // x^(y^z) = (x^y)^z
    // x^x=0
    // we just xor all the numbers

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 4, 3, 4, 5, 5, 9, 2, 9, 2 };
        System.out.println(Odd(arr));
    }

    public static int Odd(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = (res ^ arr[i]);
        }
        return res;
    }
}
