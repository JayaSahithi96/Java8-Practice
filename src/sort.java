import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{
    public int compare(Integer I1,Integer I2){
        return (I1>I2)?-1:(I1<I2)?1:0;
    }
        }

public class sort {
    public static void main(String[] args){
        ArrayList<Integer> l= new ArrayList<Integer>();
        l.add(10);
        l.add(1);
        l.add(30);
        l.add(15);
        l.add(5);
        System.out.println("Before sorting" +l);
        Collections.sort(l, new MyComparator());
        System.out.println("After sorting" +l);

    }
}
