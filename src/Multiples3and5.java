import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Multiples3and5 {

    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0 || i % 5 == 0)) {
                sum = sum + i;
            }
        }


        return sum;
        //TODO: Code stuff here
    }

    @Test
    public void test() {
        assertEquals(23, new Multiples3and5().solution(10));
    }

}
