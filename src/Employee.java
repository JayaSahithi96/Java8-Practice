import java.util.ArrayList;
import java.util.Collections;

class Employee {
    int eno;
    String eName;
    Employee(int eno, String eName){
        this.eno=eno;
        this.eName=eName;
    }
    public String toString(){
        return eno+":"+eName;
    }
}
class test1{
public static void main(String[] args){
    ArrayList<Employee> l= new ArrayList<Employee>();
    l.add(new Employee(1,"Sahithi"));
    l.add(new Employee(2,"Jaya"));
    l.add(new Employee(5,"Honey"));
    l.add(new Employee(3,"Usha"));
    System.out.println("before Sorting"+l);
    Collections.sort(l,(e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0);
    System.out.println("After Sorting" +l);
}

}
