import java.util.IllformedLocaleException;

public class SillyAdditon {

    public static void main(String[] args) {
        add(123, 123);
    }


    public static int add(int num1, int num2){

        int[] num1d = digits(num1);
        int[] num2d = digits(num2);
        return num1d.length > num2d.length ? result(num1d, num2d) : result(num2d, num1d);
    }

    public static int[] digits(int number){
        int i = Integer.toString(number).length();
        int[] digits = new int[i];

        while (i > 0){
            digits[i - 1] = number % 10;
            i--;
            number /= 10;
        }
        return digits;
    }

    public static int result(int[] arr1, int[] arr2){ // arr1 >= arr2!


        int i1 = arr1.length;
        int i2 = arr2.length;
        int difference = i1 - i2;

        if (difference < 0) throw new IllformedLocaleException();

        int[] result = new int[i1];
        for (int i = i2; i > 0; i--){
            result[i1 - 1] = arr1[i1 - 1] + arr2[i2 - 1];
            i1--; i2--;
        }

        for (int i = difference - 1; i >= 0; i--){
            result[i] = arr1[i];
        }

        StringBuilder str = new StringBuilder();
        for (int dig:result){
            str.append(dig);
        }

        return Integer.parseInt(str.toString());

    }
}
