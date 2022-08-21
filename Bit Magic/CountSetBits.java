import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {

    }

    public static int CountBits(int n) {
        int res = 0;

        while (n > 0) {
            if ((n & 2) == 0) {
                res++;
            }
            n = n << 1;
        }
        return res;
    }

    public static int BriankErginAlgo(int n) {
        int res = 0;

        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }

        return res;
    }

    // another method of lookup method, see video for code
}
