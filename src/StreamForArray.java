import java.util.stream.Stream;

public class StreamForArray {
    public static void main(String[] args) {
        Integer[] i = {14, 2, 32, 46, 7, 12};
        Stream<Integer> s1 = Stream.of(i);
        s1.forEach(System.out::println);
    }
}

