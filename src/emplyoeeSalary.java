import java.util.function.BiFunction;

public class emplyoeeSalary {
    int eno;
    String name;
    double dailyWage;

    emplyoeeSalary(int eno, String name, double dailyWage) {
        this.eno = eno;
        this.name = name;
        this.dailyWage = dailyWage;
    }
}
class timeSheets{
    int eno;
    int days;
    timeSheets(int eno,int days){
        this.eno=eno;
        this.days=days;
    }
}
class calculate{
    public static void main(String[] args){
        emplyoeeSalary e= new emplyoeeSalary(101,"Sahithi",2000);
        timeSheets t=new timeSheets(102,25);
        BiFunction<emplyoeeSalary,timeSheets,Double> f=(E,T)->e.dailyWage*t.days;
        System.out.println("Monthly salary is:"+f.apply(e,t));
    }
}
