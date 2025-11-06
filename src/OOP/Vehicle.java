package OOP;

public class Vehicle {

    public String material;
    private double mass;
    private double max_speed;

    public Vehicle(String material, double mass, double max_speed) {
        this.material = material;
        this.mass = mass;
        this.max_speed = max_speed;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

}
