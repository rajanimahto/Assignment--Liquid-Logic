// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedListImpl<Integer> myDoublyLinkedListImpl = new MyDoublyLinkedListImpl<Integer>();
        myDoublyLinkedListImpl.addFirstElement(10);
        myDoublyLinkedListImpl.addFirstElement(34);
        myDoublyLinkedListImpl.addLastElement(56);
        myDoublyLinkedListImpl.addLastElement(364);
        myDoublyLinkedListImpl.moveForward();
        myDoublyLinkedListImpl.removeFirstElement();
        myDoublyLinkedListImpl.removeLastElement();
        myDoublyLinkedListImpl.moveBackward();

        MyDoublyLinkedListImpl<Animal> myDoublyLinkedListImpl1 = new MyDoublyLinkedListImpl<Animal>();
        Dog d=new Dog();;
        Cat c= new Cat();
        Mouse m= new Mouse();
        Horse h= new Horse();
        Bird b=new Bird();
        myDoublyLinkedListImpl1.addFirstElement(d);
        myDoublyLinkedListImpl1.addFirstElement(c);
        myDoublyLinkedListImpl1.addLastElement(m);
        myDoublyLinkedListImpl1.addLastElement(h);
        myDoublyLinkedListImpl1.addFirstElement(d);
        myDoublyLinkedListImpl1.addFirstElement(b);
        myDoublyLinkedListImpl1.moveForward();
        myDoublyLinkedListImpl1.removeFirstElement();
        myDoublyLinkedListImpl1.removeLastElement();
        myDoublyLinkedListImpl1.moveBackward();

    }
}