import java.util.IllformedLocaleException;

public class SillyAdditon2 {

    public static void main(String[] args) {
        add(1123, 123);
    }


    public static int add(int num1, int num2){
        StringBuilder result = new StringBuilder();
        while (num1 + num2 > 0){
            result.insert(0, (num1 % 10 + num2 % 10));
            num1 /= 10;
            num2 /= 10;
        }

        return Integer.parseInt(result.toString());

    }

}
