interface one{
    public void m1();
}
public class test {
    public static void main(String[] args){
        one i=()->System.out.println("Lamda expression");
        i.m1();
    }
}
