import com.Stack.StackApp;

public class Stack {
    public static void main(String[] args) throws Exception {
        StackApp s = new StackApp(5);

        boolean empty = s.empty();
        System.out.println(empty);

        s.push(5);
        s.push(5);
        s.push(5);
        s.push(3);

        System.out.println("Size: " + s.size());
        System.out.println("Poped: " +s.pop());
        System.out.println("Poped: " +s.pop());
        System.out.println("Poped: " +s.pop());
        System.out.println("Size: " +s.size());
        System.out.println("top: " +s.top());
        System.out.println("Poped: " +s.pop());
        System.out.println("Poped: " +s.pop());
        
        int top = s.top();
        System.out.println("Top Element: " + top);
        System.out.println("Size: " + s.size());

        
    }
}
