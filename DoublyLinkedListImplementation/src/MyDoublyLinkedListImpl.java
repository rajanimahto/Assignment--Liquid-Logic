import java.util.NoSuchElementException;

public class MyDoublyLinkedListImpl<E> implements MyDoublyLinkedList<E> {

        private Node head;
        private Node tail;
        private int size;

    private class Node {
            E element;
            Node next;
            Node prev;

            public Node(E element, Node next, Node prev) {
                this.element = element;
                this.next = next;
                this.prev = prev;
            }
        }

        /**
         * adds 1st element to the doubly linked list
         * @param element
         */
        public void addFirstElement(E element) {
            Node tmp = new Node(element, head, null);
            if(head != null ) {head.prev = tmp;}
            head = tmp;
            if(tail == null) { tail = tmp;}
            size++;
            System.out.println("adding 1st element: "+element);
        }

    /**
     * Adds last element to the doubly linked list
     * @param element
     */

    public void addLastElement(E element) {

            Node tmp = new Node(element, null, tail);
            if(tail != null) {tail.next = tmp;}
            tail = tmp;
            if(head == null) { head = tmp;}
            size++;
            System.out.println("adding: "+element);
        }

    /**
     * Moving the cursor head
     */
    public void moveForward(){

            System.out.println("moving forward:");
            Node tmp = head;
            while(tmp != null){
                System.out.println(tmp.element);
                tmp = tmp.next;
            }
        }

        /**
         * this method moves cursor tail
         */
        public void moveBackward(){

            System.out.println("moving backward tail");
            Node tmp = tail;
            while(tmp != null){
                System.out.println(tmp.element);
                tmp = tmp.prev;
            }
        }

    /**
     * This method removes the first element from the doubly linked list
     * @return
     */
    public E removeFirstElement() {
            if (size == 0) throw new NoSuchElementException();
            Node tmp = head;
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("deleted: "+tmp.element);
            return tmp.element;
        }

        /**
         * This method removes the first element from the doubly linked list
         * @return
         */
        public E removeLastElement() {
            if (size == 0) throw new NoSuchElementException();
            Node tmp = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
            System.out.println("deleted: "+tmp.element);
            return tmp.element;
        }

    }
