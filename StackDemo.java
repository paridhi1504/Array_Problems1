import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("india");
        stack.push("Germany");
        stack.push("America");
        System.out.println(" Original Stack" +stack);
        String poppedElement = stack.pop();
        System.out.println("popped element:" +poppedElement);
        System.out.println("Now the stack look like :" +stack);
        String poppedElement1 = stack.pop();
        System.out.println("popped element:" +poppedElement1);
        String poppedElement2 = stack.peek();
        System.out.println("Now the stack look like:" +stack);

    }
}
