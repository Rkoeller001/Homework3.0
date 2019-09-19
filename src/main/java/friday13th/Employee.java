package friday13th;

public class Employee {
    //properties, fields,
    public String name;
    public float hoursWorked;
    public double hourlyRate;

    //constructor
    public Employee(String name, float hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    //method or function
    public void calculatePay() {
        System.out.println(hourlyRate * hoursWorked);
    }
    public double calculatePay(int maxhours) {
        if (maxhours > 40) {

        } else {
            return hourlyRate = hoursWorked;
        }

        return 0;
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
