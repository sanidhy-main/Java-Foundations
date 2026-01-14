abstract class Shape {
    abstract double area();
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class AbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape square = new Square(3);
        System.out.println(circle.area());
        System.out.println(square.area());

    }
}