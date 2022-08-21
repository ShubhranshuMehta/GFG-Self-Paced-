import java.util.*;

public class IfKthBitIsSetOrNot {
    public static void main(String[] args) {
        System.out.println(KthBit(5, 2));
    }

    public static boolean KthBit(int n, int k) {
        if ((n >> (k - 1) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
