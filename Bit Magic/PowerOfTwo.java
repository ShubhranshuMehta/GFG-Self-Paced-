import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {

    }

    public static boolean TwoPower(int n) {
        if (n == 0) {
            return false;
        }
        return ((n & (n - 1)) == 0);

    }
}
