import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        //values.forEach(i -> System.out.println(i));
        //Internal Iteration

//        Consumer<Integer> c=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//        values.forEach(c);




        values.forEach(StreamsDemo::doubleIt);
    }
    public static void doubleIt(int i)
    {
        System.out.println(i*2);
    }
}
