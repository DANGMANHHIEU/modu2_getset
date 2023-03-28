package ex2;

public class car {
    private String name;
    private String engine;
    public static  int numberCar;
    public car(String name,String engine){
        this.name = name;
        this.engine = engine;
        numberCar++;
    }

}
