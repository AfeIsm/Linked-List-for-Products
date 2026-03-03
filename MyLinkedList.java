public class MyLinkedList<AnyType extends IDedObject> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<AnyType> head;

    public MyLinkedList() {
        head = null;
    }

    public void makeEmpty() {
        head = null;
    }

    
    public AnyType findID(int id) {
        Node<AnyType> cur = head;
        while (cur != null) {
            if (cur.data.getID() == id) {
                return cur.data;
            }
            cur = cur.next;
        }
        return null;
    }

    public boolean insertAtFront(AnyType x) {
        if (x == null) return false;

        if (findID(x.getID()) != null) {
            return false;
        }

        head = new Node<>(x, head);
        return true;
    }

    public AnyType deleteFromFront() {
        if (head == null) return null;

        AnyType removed = head.data;
        head = head.next;
        return removed;
    }

    public AnyType delete(int id) {
        if (head == null) return null;

        if (head.data.getID() == id) {
            return deleteFromFront();
        }

        Node<AnyType> prev = head;
        Node<AnyType> cur = head.next;

        while (cur != null) {
            if (cur.data.getID() == id) {
                prev.next = cur.next;      // unlink
                return cur.data;
            }
            prev = cur;
            cur = cur.next;
        }

        return null;
    }

    public void printAllRecords() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node<AnyType> cur = head;
        while (cur != null) {
            cur.data.printID();
            System.out.println("----");
            cur = cur.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}
