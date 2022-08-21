import java.util.*;

public class PowerSet {
    public static void main(String[] args) {

    }

    public static void Set(String s) {
        int n = s.length();
        for (int i = 0; i < Math.pow(2, n); i++) {

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        }
    }
}
