import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String userName;
    String pwd;
    User(String userName,String pwd){
        this.userName=userName;
        this.pwd=pwd;
    }
}

class authenticate{
    public static void main(String[] args){
        Predicate<User> p=u->u.userName.equals("Sahithi") && u.pwd.equals("Honey");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the username:");
        String userName=sc.next();
        System.out.println(("enter the password:"));
        String pwd=sc.next();
        User user= new User(userName,pwd);
        if(p.test(user)){
            System.out.println("valid user");
        }
        else{
            System.out.println("Not a valid user");
        }
    }

}