import java.util.LinkedList;
import java.util.Queue;

class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Queue<Datatype> (name) = new LinkedList<>():

        queue.add("a");
        queue.add("b");
        queue.add("c");

        System.out.println(queue.poll()); //a
        System.out.println(queue.peek()); //b
    }
}