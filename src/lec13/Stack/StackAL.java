package lec13.Stack;

import java.util.ArrayList;

// Stack implementation using ArrayLists (with Interfaces)
// First In Last Out (FILO)
public class StackAL<T> implements StackInt<T> {
    private ArrayList<T> _stack;

    public StackAL(){
        _stack = new ArrayList<T>();
    }

    // pushes a node to the top of the stack
    public int push(T value){
        _stack.add(value);
        return (getSize()-1);
    }

    // pops the top of the stack and returns the value
    // (=null if stack empty)
    public T pop() {
        if (_stack.isEmpty()) {
            return (null);
        } else {
            return (_stack.remove(_stack.size()-1));
        }
    }

    public int getSize(){
        return (_stack.size());
    }
}
