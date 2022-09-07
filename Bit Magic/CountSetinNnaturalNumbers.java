public class CountSetinNnaturalNumbers {

    public static void main(String[] args) {
        System.out.println(SetinNnumbers(8));
    }

    public static int SetinNnumbers(int n) {

        if (n == 0) {
            return 0;
        }
        int x = forX(n);

        int btill2x = x * (1 << (x - 1));
        int msb2xton = n - (1 << (x)) + 1;
        int rest = n - (1 << x);
        int ans = btill2x + msb2xton + SetinNnumbers(rest);
        return ans;

    }

    public static int forX(int n) {
        int res = 0;
        while ((1 << res) <= n) {
            res++;
        }
        return res - 1;
    }

}
