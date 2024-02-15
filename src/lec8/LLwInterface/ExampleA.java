package lec8.LLwInterface;

/**
 * ExampleA : Simple Linked List example using interface LListInt
 */
class Node {
    int _value;
    Node _nextNode;

    Node(int val){          // Constructor
        _value = val;
        _nextNode = null;
    }
}

public class ExampleA {
    public static void main(String[] args){
        System.out.println("Inserting 10, 15, and 20 in an unordered Linked List");
        LList list = new LList(10);
        list.insertNode(15);
        list.insertNode(20);

        System.out.println("Searching for node 5:" + list.search(list._head, 5));
        System.out.println("Searching for 15:" +list.search(list._head, 15));

        System.out.println("Searching for index of 5:" + list.search(list._head, 5, 0));
        System.out.println("Searching for index of 15:" +list.search(list._head, 15, 0));

        System.out.println("deleting none existing node:" +list.deleteNode(5));
        System.out.println("deleting middle node 15:" +list.deleteNode(15));
        System.out.println("Searching for index of 15:" +list.search(list._head, 15));
        System.out.println("deleting last node 20:" +list.deleteNode(20));
        System.out.println("Searching for index of 20:" +list.search(list._head, 20));
        System.out.println("deleting 10:" +list.deleteNode(10));
        System.out.println("Searching for index of 10:" +list.search(list._head, 10));
    }
}

