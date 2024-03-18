package lec15;

// Binary Heap implementation of a Priority Queue
public class MainHeap {
    public static void main(String[] args) {
        test1();
    }

    static void test1() {
        MaxHeap<String> maxHeap = new MaxHeap<>();
        maxHeap.enqueue("A", 45);
        maxHeap.enqueue("B", 23);
        maxHeap.enqueue("C", 39);
        maxHeap.enqueue("D", 9);
        maxHeap.enqueue("E", 15);
        maxHeap.enqueue("F", 52);

        // After implementing dequeue(), you can write code here to test it.
        maxHeap.printHeap();
        PElement<String> pE;
        pE = maxHeap.dequeue();

    }
}
