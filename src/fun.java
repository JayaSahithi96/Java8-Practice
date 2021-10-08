import java.util.function.Function;

public class fun {
    public static void main(String[] args){
        String q="Sahithi is cute";
        Function<String,Integer> f=S->S.length();
        Function<String,String> f1=S->S.replaceAll(" ","");
        Function<String,Integer> f2=S->S.length()-S.replaceAll(" ","").length();
        System.out.println(f.apply("Sahithi"));
        System.out.println(f2.apply(q));

    }
}
