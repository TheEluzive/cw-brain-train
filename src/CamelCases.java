import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCases {

    @Test
    public void tests() {
        assertEquals( "camel Casing", CamelCases.camelCase("camelCasing"), "Incorrect");
        assertEquals( "camel Casing Test", CamelCases.camelCase("camelCasingTest"), "Incorrect");
        assertEquals( "camelcasingtest", CamelCases.camelCase("camelcasingtest"), "Incorrect");
    }



    public static String camelCase(String input) {
        StringBuilder newWord = new StringBuilder();
        StringBuilder result = new StringBuilder();
        char[] inputStringToChar = input.toCharArray();

        for (char c:inputStringToChar){
            if (Character.isUpperCase(c)){
                result.append(newWord).append(" ");

                newWord = new StringBuilder("" + c);
            }
            else {
                newWord.append(c);
            }

        }

        result.append(newWord);

        return result.toString();
    }


    //return input.replaceAll("([A-Z])", " $1");
}
