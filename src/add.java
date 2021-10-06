interface sum{
    int addition(int a, int b);
}
public class add {
    public static void main(String[] args){

        sum s1=(a,b)->(a+b);
        System.out.println(s1.addition(10,20));

    }



}
