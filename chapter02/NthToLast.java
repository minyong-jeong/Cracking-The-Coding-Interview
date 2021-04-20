/*
 * Question 2.2
 */
package chapter02;

import utils.LinkedListNode;

public class NthToLast {
    public static LinkedListNode nthToLast(LinkedListNode head, int k) {
        LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        
        for (int i = 0; i < k; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode first = head;
        for (int i = 1; i <= 10; i++) {
            first.next = new LinkedListNode(i);
            first = first.next;
        }
        
        LinkedListNode result = nthToLast(head, 3);
        System.out.println(result.data);
    }
}
