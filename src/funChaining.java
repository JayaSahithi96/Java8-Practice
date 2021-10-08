import java.util.function.Function;

public class funChaining {
    public static void main(String[] args){
        Function<String,String> f= S->S.toUpperCase();
        Function<String,String> f1=S->S.substring(0,9);
        System.out.println(f.apply("Sahithi"));
        System.out.println(f1.apply("Goonjunpyo789"));
        System.out.println(f.andThen(f1).apply("Goonjunpyo789"));
        System.out.println(f.compose(f1).apply("Goonjunpyo789"));

    }
}
