package ar.fiuba.tdd.template;

public class LinkedList<T> {

    private Nodo<T> first;
    private int size;

    public LinkedList() {
        emptyList();
        size = 0;
    }

    private void emptyList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(T item) {
        Nodo<T> newNode = new Nodo<T>(item);
        try {
            newNode.setNext(this.first);
            add(newNode);
        } catch (Exception e) {
            add(newNode);
        }
    }

    private void add(Nodo<T> newNode) {
        this.first = newNode;
        this.size++;
    }

    public void addLast(T item) {
        Nodo<T> newNode = new Nodo<T>(item);
        Nodo<T> auxNode;

        if (isEmpty()) {
            addFirst(item);
        } else {
            auxNode = this.first;
            while (auxNode.getNext() != null) {
                auxNode = auxNode.getNext();
            }
            auxNode.setNext(newNode);
            this.size ++;
        }
    }

    public void removeFirst() throws EmptyListException {
        try {
            this.first = this.first.getNext();
        } catch (Exception e) {
            throw new EmptyListException();
        }
    }

    public T getFirst() throws EmptyListException {
        try {
            return this.first.getData();
        } catch (Exception e) {
            throw new EmptyListException();
        }
    }

    public int size() {
        return this.size;
    }

    public T top() throws EmptyListException {
        try {
            T dato = getFirst();
            removeFirst();
            this.size --;
            return dato;
        } catch (Exception e) {
            throw new EmptyListException();
        }
    }
}
