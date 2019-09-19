package friday13th;

public class EmploeeTest {

    public static void main(String[] args) {
        //int x = 10; make objects or instances here
        Employee employee1 = new Employee("Mikaila", 40.0f, 20.00);
        System.out.println(employee1);
        employee1.calculatePay();
        Employee employee2 = new Employee("Ryan", 90.0f,12.00);
        System.out.println(employee2);
        employee2.hourlyRate = 100.00;
        employee2.calculatePay();
        Employee employee3 = new Employee("ryan",90.0f,23.00);
        System.out.println(employee3);
        employee3.calculatePay();
        System.out.println(employee3.calculatePay(41));
    }
}

