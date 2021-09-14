import org.junit.jupiter.api.Test;


import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Multiples3and5 {

    public int solution(int number) {
//        int sum = 0;
//        for (int i = 0; i < number; i++) {
//            if ((i % 3 == 0 || i % 5 == 0)) {
//                sum = sum + i;
//            }
//        }
//
//        return sum;
        return IntStream.range(0, number).filter(o -> o % 3 == 0 || o % 5 == 0)
                .sum();
        //TODO: Code stuff here
    }

    @Test
    public void test() {
        assertEquals(23, new Multiples3and5().solution(10));
    }

}
