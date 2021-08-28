public class FindNextSquare {

    public static void main(String[] args) {
        System.out.println(
                findNextSquare(14)
        );
        System.out.println(
                findNextSquare(144)
        );
        System.out.println(21.5%1);
    }

    public static long findNextSquare(long sq){
        double root = Math.sqrt(sq);
        if (root % 1 > 0)
            return -1;
        else
            return (long) Math.pow(Math.sqrt(sq)+1, 2);
    }
}
