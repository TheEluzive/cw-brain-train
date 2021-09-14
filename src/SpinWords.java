import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpinWords {

    public static void main(String[] args) {

    }

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
    public String spinWords(String sentence) {

        StringBuilder result = new StringBuilder();
        String word = "";
        char[] strToChars = sentence.toCharArray();


        for (char c : strToChars){
            if (c == ' '){
                word = reverseStringBigger5Symbols(word);
                result.append(word).append(" ");
                word = "";


            }
            else{
                word = word + c;


            }

        }
        result.append(reverseStringBigger5Symbols(word));


        return result.toString();

    }

    public static String reverseStringBigger5Symbols(String str){
        if (str.length() < 5) return str;
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            result.append(str.charAt(i));
        }

        return result.toString();
    }


    @Test
    public void reverseStringTest(){
        Assert.assertEquals("abcdef", reverseStringBigger5Symbols("fedcba"));
    }
}
