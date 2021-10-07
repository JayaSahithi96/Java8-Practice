import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class names {
    public static void main(String[] args){
        String[] name={"Karina", "Kapoor","Sahithi","",null,""};
        Predicate<String> p= S->S!=null&& S.length() != 0;
        ArrayList<String> l= new ArrayList<String>();
        for(String s: name){
            if(p.test(s)) {
                l.add(s);
            }
        }
        System.out.println("The valid String is");
        System.out.println(l);
    }
}
