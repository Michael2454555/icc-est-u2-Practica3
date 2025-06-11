package Model;
public class LinkedList<T> {
    private NodeGeneric<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void appendToTail(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (head == null) {
            head = newNode;
        } else {
            NodeGeneric<T> actual = head;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(newNode);
        }
        size++;
    }

    public T findByValue(T value) {
        NodeGeneric<T> actual = head;
        while (actual != null) {
            if (actual.getValue().equals(value)) {
                return actual.getValue();
            }
            actual = actual.getNext();
        }
        return null;
    }

    public boolean deleteByValue(T value) {
        if (head == null) return false;
        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return true;
        }
        NodeGeneric<T> actual = head;
        while (actual.getNext() != null) {
            if (actual.getNext().getValue().equals(value)) {
                actual.setNext(actual.getNext().getNext());
                size--;
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public void printLista() {
        NodeGeneric<T> actual = head;
        while (actual != null) {
            System.out.println(actual.getValue());
            actual = actual.getNext();
        }
    }

    public int getSize() {
        return size;
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public void setHead(NodeGeneric<T> head) {
        this.head = head;
    }
}