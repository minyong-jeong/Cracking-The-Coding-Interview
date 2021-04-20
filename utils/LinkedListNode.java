package utils;

public class LinkedListNode {
    public int data;
    public LinkedListNode next = null;

    public LinkedListNode() {
    }

    public LinkedListNode(int data) {
        this.data = data;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public static void printList(LinkedListNode first) {
        while (first != null) {
            System.out.println(first.data);
            first = first.next;
        }
    }
}