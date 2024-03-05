package lec13.Queue;

// Example of Queues using both ArrayList and Linked Lists with interfaces
public class MainQueue {
    public static void main(String[] args){
        testQueueLL();          // Example using LL
        testQueueAL();          // Example using AL
        testQueueALStrings();   // Example using Strings
    }
    static void testQueueLL(){
        QueueLL<Integer> queue = new QueueLL<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Enqueued = "+ 30 + ", queue size = "+queue.getSize());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
    }
    static void testQueueAL(){
        QueueAL<Integer> queue = new QueueAL<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Enqueued = "+ 30 + ", queue size = "+queue.getSize());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
    }
    static void testQueueALStrings(){
        QueueAL<String> queue = new QueueAL<>();
        String s;
        s = "How";
        queue.enqueue(s);
        System.out.println("Enqueued = "+ s + ", queue size = "+queue.getSize());
        s = "are";
        queue.enqueue(s);
        System.out.println("Enqueued = "+ s + ", queue size = "+queue.getSize());
        s = "you?";
        queue.enqueue(s);
        System.out.println("Enqueued = "+ s + ", queue size = "+queue.getSize());

        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());
        System.out.println("queue dequeued value = "+ queue.dequeue());

    }
}
