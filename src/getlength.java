interface two{
    public int test(String s);
}
public class getlength {
    public static void main(String[] args){
        two s1= s-> s.length();
        System.out.println(s1.test("hello"));
    }
}
