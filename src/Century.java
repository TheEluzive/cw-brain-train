public class Century {

    public static void main(String[] args) {
        System.out.println(
                century(2001)
        );
        System.out.println(
                century(1900)
        );

        System.out.println(
                century(189)
        );

    }

    public static int century(int number) {
        /*return (double)number  % 100 == 0 ?
                number / 100  : number / 100 + 1;*/
        return (number + 99) / 100;

    }
}
