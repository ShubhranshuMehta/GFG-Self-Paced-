import java.util.*;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        SieveofEratosthenes(10);
    }

    public static void SieveofEratosthenes(int n) {
        Boolean[] data = new Boolean[n + 1];

        Arrays.fill(data, true);

        List<Boolean> arrli = Arrays.asList(data);

        arrli.set(0, false);
        arrli.set(1, false);
        System.out.println(arrli);

        for (int i = 2; i <= n; i++) {
            if (arrli.get(i)) {
                for (int j = i * 2; j <= n; j += i) { // or we can replace i*2 with i*i to furthur optimize the solution
                    arrli.set(j, false);
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (arrli.get(i)) {
                System.out.println(i);
            }
        }

    }

}
