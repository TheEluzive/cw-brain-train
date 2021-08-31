public class FindNextSquare {



    public static long findNextSquare(long sq){
        double root = Math.sqrt(sq);
        return root % 1 == 0
                ? (long) ((root + 1) * (root + 1))
                : -1;
    }


}
