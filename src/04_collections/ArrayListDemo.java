import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // ArrayList<DataType> = new ArrayList<>();

        names.add("Alex");
        names.add("Sanidhy");
        names.add("Alex"); //Duplicates allowed

        System.out.println(names.get(0));
        System.out.println(names.size());

        names.remove("Alex");
        System.out.println(names.get(0));
        System.out.println(names.size());

        for(String name : names) {
            System.out.println(name);
        }
    }
}