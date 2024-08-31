package abstractEx;

public class AbstractEX {
    public static void main(String[] args) {
        Car c = new Car();
        c.accelerate();
        c.breaks();
    }
}

abstract class Vehicle{
    abstract  void accelerate();

    abstract void breaks();
}
class Car extends Vehicle{
    void accelerate(){
        System.out.println("Car is accelerating!");
    }
    void breaks(){
        System.out.println("Breaking!");
    }
}

