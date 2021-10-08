import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    String name;
    int marks;
    Student(String name,Integer marks){
        this.name=name;
        this.marks=marks;
    }
    class grade{}
    public static void main(String[] args){
        ArrayList<Student> l= new ArrayList<Student>();
        populate(l);
        Predicate<Student> p= S->S.marks>=60;
        Function<Student,String> f= S->{
            int marks=S.marks;
            if(marks>=80){
                return "A";
            }
            else if(marks>=70){
                return "B";
            }
            else if(marks>=60){
                return "c";
            }
            else if(marks>=50){
                return "D";
            }
            else if(marks>=40){
                return "E";
            }
            else {
                return "Fail";
            }
        };
        Consumer<Student> c= S->{
            System.out.println("Student Name:"+S.name);
            System.out.println("Student Marks:"+S.marks);
            System.out.println(f.apply(S));
        };

        for(Student s:l){
            if(p.test(s)){
            c.accept(s);
        }
        }


    }
    public static void populate(ArrayList<Student> l){
        l.add(new Student("Sahithi",90));
        l.add(new Student("Jaya",70));
        l.add(new Student("Aravapalli",30));
        l.add(new Student("Nani",50));
    }
}
