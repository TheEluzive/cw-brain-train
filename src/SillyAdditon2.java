import java.util.IllformedLocaleException;

public class SillyAdditon2 {




    public static int add(int num1, int num2){
        String result = "";
        while (num1 + num2 > 0){
            result = num1 % 10 + num2 % 10 + result;
            num1 /= 10;
            num2 /= 10;
        }

        return result.isEmpty() ? 0 : Integer.parseInt(result.toString());

    }

}
