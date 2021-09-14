import java.util.ArrayList;
import java.util.Arrays;

public class NotMyClass {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(solve(new String[]{"fdfds", "abcde", "fgkl4gfdgfd"}))

        );
    }

    public static int[] solve(String[] arr) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arr) {
            int counter = 0;
            char[] array = s.toCharArray();
            for (int i = 0; i < alphabet.toCharArray().length; i++) {
                try {
                    if (Character.toLowerCase(array[i]) == alphabet.toCharArray()[i]) counter++;
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
            list.add(counter);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
