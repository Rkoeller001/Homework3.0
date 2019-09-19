package CarClass;

import java.lang.reflect.Method;

public class CarClassTest {
    public static void main(String[] args) {
        Lambo Test = new Lambo("Aventador",300.00);
        System.out.println(Test);
        Test.setName("Diablo");
        Test.whatsTheSpeed();
        Test.setSpeed(500.00);


    }
}
