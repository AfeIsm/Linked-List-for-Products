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

    // Constructor which generates an empty list
    public MyLinkedList() {
        head = null;
    }

    // empties the linked list
    public void makeEmpty() {
        head = null;
    }

    // Get the object with the particular ID, don’t remove; return null if empty or not found
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

    // insert at front of list or return false if that ID already exists
    public boolean insertAtFront(AnyType x) {
        if (x == null) return false;

        // ID must be unique
        if (findID(x.getID()) != null) {
            return false;
        }

        head = new Node<>(x, head);
        return true;
    }

    // delete and return the record at the front or return null if empty
    public AnyType deleteFromFront() {
        if (head == null) return null;

        AnyType removed = head.data;
        head = head.next;
        return removed;
    }

    // find and delete the record with the given ID or return null if not found
    public AnyType delete(int id) {
        if (head == null) return null;

        // if head matches
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

    // print all elements in order; if empty print appropriate message
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

    // Optional helper (not required) for menu UX
    public boolean isEmpty() {
        return head == null;
    }
}
