import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeManagement {
    String name;
    String designation;
    Double salary;
    String city;

    EmployeeManagement(String name, String designation, Double salary,String city){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.city=city;
    }
    public String toString(){
        String s=String.format("(%s,%s,%.2f,%s)",name,designation,salary,city);
        return s;
    }
}
class details {
    public static void main(String[] args) {
        ArrayList<EmployeeManagement> l = new ArrayList<EmployeeManagement>();
        populate(l);
        System.out.println("Salary before increment" +l);
        Predicate<EmployeeManagement> p1= emp->emp.designation.equals("Manager");
        System.out.println("Manager's information:");
        display(p1,l);
        Predicate<EmployeeManagement> p2= emp->emp.city.equals("Sacramento");
        System.out.println("Employee info from sacramento");
        display(p2,l);
        Predicate<EmployeeManagement> p3=e->e.salary<=3000;
        Function<EmployeeManagement,EmployeeManagement> f= e->{
                e.salary=e.salary+1000;
                return e;
        };
        ArrayList<EmployeeManagement> l1= new ArrayList<EmployeeManagement>();
        for(EmployeeManagement e:l){
            if(p3.test(e)){
                l1.add(f.apply(e));
                System.out.println(e);
            }
        }
    }

    public static void populate(ArrayList<EmployeeManagement> l) {
        l.add(new EmployeeManagement("Sahithi", "Java Developer", 12000.00, "Sacramento"));
        l.add(new EmployeeManagement("Honey", "Java Developer", 2000.00, "Hyderabad"));
        l.add(new EmployeeManagement("Usha", "Manager", 12000.00, "SFO"));
    }
    public static void display(Predicate<EmployeeManagement> p,ArrayList<EmployeeManagement> l){
        for(EmployeeManagement e: l){
            if(p.test(e)) {
                System.out.println(e);
            }
        }
        System.out.println("*******");
    }
}
