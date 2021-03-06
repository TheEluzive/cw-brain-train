import java.util.Arrays;

public class Persist {

    public static int persistence(long n) {
        int  count = 0;
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

            count++;
        }
        return count;
    }
}
