class Vehicle {
    void show() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void type() {
        System.out.println("This is a Car");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Battery Powered Car");
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.show();
        e.type();
        e.battery();
    }
}
