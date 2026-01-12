class PersonWithConstructors {

    String name;
    int age;

    PersonWithConstructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Hi, " + name + "! You are " + age + " years old!");
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        PersonWithConstructors a = new PersonWithConstructors("Sanidhy", 18);
        PersonWithConstructors b = new PersonWithConstructors("Alex", 19);
        a.greet();
        b.greet();
    }
}
