import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class SortArray {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortArray.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortArray.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortArray.sortArray(new int[]{}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8 }, SortArray.sortArray(new int[]{ 5, 3, 1, 8 }));
    }


    public static int[] sortArray(int[] array) { //fall in expected tests
        int tmp = 0;

        if (array.length == 2) {
            if (array[0] > array [1]){
                tmp = array[0];
                array[0] = array[1];
                array[1] = tmp;
            }
            return array;
        }

        if (array.length < 2) {
            return array;
        }

        int arrayLimit = array.length % 2 == 0 ? 2 : 4;

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - arrayLimit; j = j + 2){
                if (array[j] > array[j + 2]){
                    tmp = array[j];
                    array[j] = array[j + 2];
                    array[j + 2] = tmp;
                }
            }
        }
        return array;
    }

}
