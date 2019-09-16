package animalTesting;

public class AnimalTest {
    public static void main(String[] args) {
        Animals animal1 = new Animals("blue");
        System.out.println(animal1);
        animal1.makeNoise();
    }
}
