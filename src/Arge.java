public class Arge {


    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        percent = percent / 100  + 1 ;
        while (p0 < p){
            p0 = (int) (p0 * percent) + aug;
            year++;
        }
        return year;
    }
}
