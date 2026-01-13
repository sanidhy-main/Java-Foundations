class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void move() {
        System.out.println(this.brand + " is moving");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void honk() {
        System.out.println(this.brand + " is honking");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car("BMW", 30, 4);

        c.move();
        c.honk();
    }
}