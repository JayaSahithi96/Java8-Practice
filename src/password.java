import java.util.function.Supplier;

public class password {
    public static void main(String[] args) {
        Supplier<String> s1 = () -> {
            String pwd = "";
            Supplier<Integer> d = () -> (int) (Math.random() * 10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#%&*+";
            Supplier<Character> s = () -> symbols.charAt((int) (Math.random() * 33));
            for (int i = 0; i <= 8; i++) {
                if (i % 2 == 0) {
                    pwd = pwd + d.get();
                }
                else
                {
                    pwd=pwd+ s.get();
                }
            }
            return pwd;
        };
        System.out.println(s1.get());
    }
}
