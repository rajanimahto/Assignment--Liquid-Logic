public interface MyDoublyLinkedList<E> {
    public void addFirstElement(E data);
    public void addLastElement(E data);
    public void moveForward();
    public E removeFirstElement();
    public E removeLastElement();
    public void moveBackward();
}
