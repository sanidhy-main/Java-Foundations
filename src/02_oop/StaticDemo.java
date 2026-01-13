class Student {
    private String name;
    static int studentCount;

    public Student(String name) {
        setName(name);
        studentCount++;
    }

    void setName(String name) {
        this.name = name;
    }

    static int getStudentCount() {
        return studentCount;
    }
}

class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("A");
        Student s2 = new Student("B");
        Student s3 = new Student("C");

        System.out.println(Student.getStudentCount());
    }
}