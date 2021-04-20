/*
 * Question 2.4
 */
package chapter02;

import utils.LinkedListNode;

public class Partition {
    public static LinkedListNode partition(LinkedListNode n, int x) {
        LinkedListNode head = n;
        LinkedListNode tail = n;
        
        while (n != null) {
            LinkedListNode next = n.next;
            if (n.data < x) {
                n.next = head;
                head = n;
            } else {
                tail.next = n;
                tail = n;
            }
            n = next;
        }
        tail.next = null;
        
        return head;
    }
    
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(3);
        LinkedListNode node1 = new LinkedListNode(5);
        LinkedListNode node2 = new LinkedListNode(8);
        LinkedListNode node3 = new LinkedListNode(5);
        LinkedListNode node4 = new LinkedListNode(10);
        LinkedListNode node5 = new LinkedListNode(2);
        LinkedListNode node6 = new LinkedListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        
        LinkedListNode result = partition(head, 5);
        LinkedListNode.printList(result);
    }
}
