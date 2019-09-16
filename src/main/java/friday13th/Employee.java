package friday13th;

public class Employee {
    //properties, fields,
    public String name;
    public float hoursWorked;
    public  double hourlyRate;
//constructor
    public Employee(String name, float hoursWorked, double hourlyRate){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    //method or function
    public void  calculatePay() {
        System.out.println(hourlyRate * hoursWorked);
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';

    }


}
