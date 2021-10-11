import java.util.function.Supplier;

public class otp {
    public static void main(String[] args){
        Supplier<String> s1=()->{
            String s="";
            for(int i=0;i<6;i++){
                s=s+(int)(Math.random()*10);
            }
            return s;
        };
        System.out.println("opt:"+s1.get());
        System.out.println("opt:"+s1.get());
    }
}
