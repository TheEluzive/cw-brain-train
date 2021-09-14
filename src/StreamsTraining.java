import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTraining {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        List<Integer> arrayList2 = arrayList.stream().map(o -> o % 2 == 0 ? o : o +1).distinct().collect(Collectors.toList());
        arrayList2.forEach(System.out::println);

    }
}
