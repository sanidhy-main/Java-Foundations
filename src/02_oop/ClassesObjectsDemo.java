class Person {

    String name;
    int age;

    void greet() {
        System.out.println("Hi, " + name + "! You are " + age + " years old!");
    }
}

public class ClassesObjectsDemo {
    public static void main(String[] args) {

        Person a = new Person();
        a.name = "Sanidhy";
        a.age = 18;

        Person b = new Person();
        b.name = "Alex";
        b.age = 19;

        a.greet();
        b.greet();
    }
}