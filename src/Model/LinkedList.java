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
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public T findByValue(T value) {
        NodeGeneric<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
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
        NodeGeneric<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void print() {
        NodeGeneric<T> current = head;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
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