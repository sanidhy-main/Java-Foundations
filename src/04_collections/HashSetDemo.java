import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> emails  = new HashSet<>();
        // HashSet<Datatype> (name) = new HashSet<>();

        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("a@gmail.com"); //ignored, as duplicates not allowed

        System.out.println(emails.size());

        for (String email : emails) {
            System.out.println(email);
        }
    }
}