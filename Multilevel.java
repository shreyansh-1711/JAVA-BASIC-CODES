//Multilevel Inheritance 29/09/2021

class Vehicle {
    void start(){
        System.out.println("Starting a vehicle");
    };
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Starting a vehicle");
    }
}

class Ford extends Car {
    void own() {

        System.out.println("Starting a vehicle");
    }
}

class Multilevel {
    public static void main(String a[]) {
        Ford f = new Ford();
        f.start();
        f.drive();
        f.own();
    }
}