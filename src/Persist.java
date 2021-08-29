import java.util.Arrays;

public class Persist {
    public static void main(String[] args) {
        System.out.println(persistence(99));
    }
    public static int persistence(long n) {
        int  r = 0;
        long[] digits;

        while (n >= 10) {

            digits = new long[Long.toString(n).length()];
           
            for (int i = 0; i < digits.length; i++) {
                digits[i] = n % 10;
                n /= 10;
            }

            n = 1;
            for (long v : digits) {
                n = n * v;
            }
            r++;
        }
        return r;
    }
}
