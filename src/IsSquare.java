public class IsSquare {
    public static void main(String[] args) {
        System.out.println(isSquare(25));
        System.out.println(isSquare(-1));
    }
    public static boolean isSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}
