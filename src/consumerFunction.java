import java.util.function.Consumer;

public class consumerFunction {
    public static void main(String[] args){
        Consumer<String> c=S-> System.out.println(S);
        c.accept("Hello");
    }
}
