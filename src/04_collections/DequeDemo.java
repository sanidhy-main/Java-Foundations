import java.util.ArrayDeque;
import java.util.Deque;

class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Datatype> (name) = new ArrayDeque();

        deque.addFirst(10);
        deque.addLast(20);

        System.out.println(deque.peek()); //10
        System.out.println(deque.peekFirst()); //10
        System.out.println(deque.peekLast()); //20
        System.out.println(deque.removeFirst()); //10
        System.out.println(deque.removeLast()); //20
    }
}