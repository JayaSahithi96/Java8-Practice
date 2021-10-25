import com.sun.codemodel.internal.JForEach;

import java.util.Random;
import java.util.stream.Stream;

public class RandomNum {
    public static void main(String[] args){
        Stream<Integer> S= Stream.generate(()->(new Random()).nextInt(100));
        S.limit(10).forEach(System.out::println);
    }
}
