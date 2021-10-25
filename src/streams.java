import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args){
        ArrayList<Integer> l= new ArrayList<Integer>();
        l.add(0);l.add(10);l.add(20);l.add(25);l.add(35);
        List<Integer> l1= l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);
        List<Integer> l2=l.stream().sorted().collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3=l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(l3);
        Integer[] array=l1.stream().toArray(Integer[]::new);
        for (Integer x:array) {
            System.out.println(x);
            
        }


    }
}
