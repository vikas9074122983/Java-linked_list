package linkedList;

public class main {
    public static void main(String[] args){

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
//        myLinkedList.prepend(1);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLenght();

//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast().value);
//        System.out.println(myLinkedList.removeLast());
//        myLinkedList.remove(1);

        myLinkedList.printList();
        System.out.println("After revrse");
        myLinkedList.reverse();


       myLinkedList.printList();

//        System.out.println("After removing first");
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst().value);
//        System.out.println(myLinkedList.removeFirst());

    }
}
