import java.util.Arrays;

public class Persist {
    public static void main(String[] args) {
        System.out.println(persistence(25));
    }
    public static int persistence(long n) {
        int  r = 0;
        long[] digits;
        long j = 1;

        while (n >= 10) {

            digits = new long[Long.toString(n).length()];

            j = 1;
            for (int i = 0; i < digits.length; i++) {
                digits[i] = n % 10;
                n /= 10;
                j = j * digits[i];
            }
            n = j;

            r++;
        }
        return r;
    }
}
