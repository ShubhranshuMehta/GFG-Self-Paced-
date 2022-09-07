import java.util.*;

public class Power {
    public static void main() {

    }

    public static double power(int x, int y) {
        if (y == 1) {
            return x;
        }

        double temp = Math.pow(x, y / 2);
        temp *= temp;

        if (y % 2 == 0) {
            return temp;
        }

        return temp * x;
    }

}
