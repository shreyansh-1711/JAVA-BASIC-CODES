class Vehicle {
    void start(){
        System.out.println("This statement is from Vehicle class");
    };
}

class Car extends Vehicle {
    void drive_car() {
        System.out.println("This statement is from Car class");
    }
}

class Bus extends Vehicle {
    void drive_bus() {

        System.out.println("This statement is from Bus class");
    }
}

class Hierarchy {
    public static void main(String a[]) {
        Car c = new Car();
        c.start();
        c.drive_car();

        Bus b = new Bus();
    b.start();
    b.drive_bus();
    }
}