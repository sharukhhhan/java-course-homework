package OOP;

public class Car extends Vehicle{
    private String engine;

    public Car(String material, double mass, double max_speed, String engine) {
        super(material, mass, max_speed);
        this.engine = engine;

    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public void something() {
        String a = this.material;
    }



}
