public class Century {


    public static int century(int number) {
        /*return (double)number  % 100 == 0 ?
                number / 100  : number / 100 + 1;*/
        return (number + 99) / 100;

    }
}
