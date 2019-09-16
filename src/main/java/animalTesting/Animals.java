package animalTesting;

public class Animals {
    public String eyes;


    public Animals(String eyes){
        this.eyes = eyes;
    }
    public void makeNoise(){
        System.out.println("rawwr");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "eyes='" + eyes + '\'' +
                '}';
    }
}
