package lec13.Stack;

// Example of Stacks using both ArrayList and Linked Lists with interfaces
public class MainStack {
    public static void main(String[] args){
        testStackLL();
        testStackAL();
        testStackLLString();
    }
    static void testStackLL() {
        StackLL<Integer> stack = new StackLL<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Pushed = "+ 30 + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
    }
    static void testStackAL(){
        StackAL<Integer> stack = new StackAL<Integer>();    // The only difference
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Pushed = "+ 30 + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
    }
    static void testStackLLString(){
        StackLL<String> stack = new StackLL<>();
        String s;
        s = "How";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        s = "are";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        s = "you?";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
        System.out.println("Stack popped value = "+ stack.pop());
    }
}
