package linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int lenght;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        lenght = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: "+head.value);
    }

    public void getTail() {
        System.out.println("Tail: "+tail.value);
    }

    public void getLenght() {
        System.out.println("Lenght: "+lenght);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (lenght == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        lenght++;
    }

    public Node removeLast() {
        if(lenght == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        lenght--;
        if (lenght == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (lenght == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        lenght++;
    }
    public Node removeFirst(){
        if(lenght == 0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        lenght--;
        if (lenght == 0){
            tail = null;
        }
        return temp;
    }
    public Node get(int index){
        if(index < 0 || index >= lenght) return null;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > lenght) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if (index == lenght){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        lenght++;
        return true;

    }
    public Node remove(int index){
        if(index < 0 || index >= lenght) return null;
        if(index == 0) return removeFirst();
        if(index == lenght-1) return removeLast();

        Node prev = get(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        lenght--;
        return temp;
    }
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<lenght;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }
}
