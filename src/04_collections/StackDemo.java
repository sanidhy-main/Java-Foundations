import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Stack<Datatype> (name) = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); //30
        System.out.println(stack.peek()); //20
    }
}