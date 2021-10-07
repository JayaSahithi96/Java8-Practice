

import java.util.function.Predicate;

public class num {
    public static void main(String[] args){
        Predicate<String> p= S->S.length()>5;
        //Predicate<String> q=s->s.length>5;
        System.out.println(p.test("abcdef"));
        System.out.println(p.test("ab"));

    }
}
