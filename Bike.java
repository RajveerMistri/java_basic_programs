abstract class Vehicle {
    abstract void startEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car Engine Started");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike Engine Started");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.startEngine();

        v = new Bike();
        v.startEngine();
    }
}
