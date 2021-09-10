import java.util.*;

public class ParseParametrs {
    private static Map<String, List<String>> query = new HashMap<>();
    private static String url = "/courses2?paramNumber1=porometr&paramNumber2=porometr2&paramNumber1=porometr3";



    public static void main(String[] args) {
        parseParameters(query, url);
        System.out.println(query.toString());
    }


    private static void parseParameters(Map<String, List<String>> map, String url){
        parseBody(map, url.split("\\?")[1]);
    }

    private static void parseBody(Map<String, List<String>> map, String url){
        try {
            String[] strDividedByAnd = url.split("&");
            String[] strInCycle;
            for (String s : strDividedByAnd) {
                strInCycle = s.split("=");
                map.computeIfAbsent(strInCycle[0], k -> new ArrayList<>());
                map.get(strInCycle[0]).add(strInCycle[1]);
            }
        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
