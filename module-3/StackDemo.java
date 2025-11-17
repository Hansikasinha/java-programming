public class StackDemo {
    public static void main(String[] args) 
{
        Stack s = new Stack(); // Create a stack

        s.push(10);   // Put 10 on the stack
        s.push(20);   // Put 20 on top
        s.pop();      // Remove top (20)
        s.push(30);   // Add 30
        System.out.println("Top item is: " + s.peek());  // Show top (30)
    }
}
