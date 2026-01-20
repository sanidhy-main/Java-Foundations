import java.util.HashMap;

class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        // HashMap<Datatype 1, Datatype 2> (name) = new Hashmap<>();

        students.put(1, "Sanidhy");
        students.put(2, "Alex");

        System.out.println(students.get(1));

        for (Integer id : students.keySet()) {
            System.out.println(id + " is " + students.get(id));
        }
    }
}