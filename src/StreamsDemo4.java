import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo4 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
        System.out.println(values.stream().filter(i->i%5==0).reduce(0,(c,e)->c+e));
    }
}
