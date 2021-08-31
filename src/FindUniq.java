public class FindUniq {

    public static double findUniq(double[] arr) {
        double defaultNumber = 0;
        if (arr[0] == arr [1] && arr[1] == arr [2]) {
            defaultNumber = arr[0];
            for (double v : arr) {
                if (v != defaultNumber) return v;
            }
        }
        else
            if ( arr[0] == arr[1]) return arr[2];
                else
                    if (arr[0] == arr[2]) return arr[1];
                    else return arr[0];

        // Do the magic
        return arr[0];
    }
}
