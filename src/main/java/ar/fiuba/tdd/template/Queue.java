package ar.fiuba.tdd.template;

public class Queue<T> {

    private LinkedList<T> linkedList;

    public Queue() {
        linkedList = new LinkedList<T>();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.size();
    }

    public void add(T item) {
        linkedList.addLast(item);
    }

    public Object top() throws EmptyQueueException {
        try {
            return linkedList.top();
        } catch (EmptyListException e) {
            throw new EmptyQueueException();
        }
    }

    public void remove() throws EmptyQueueException {
        try {
            linkedList.removeFirst();
        } catch (EmptyListException e) {
            throw new EmptyQueueException();
        }
    }
}
