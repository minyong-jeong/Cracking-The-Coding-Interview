/*
 * Question 2.3
 */
package chapter02;

import utils.LinkedListNode;

public class DeleteNode {
	public static boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false;
		}
		n.data = n.next.data;
		n.next = n.next.next;
		return true;
	}
	
	public static void main(String[] args) {
		LinkedListNode node0 = new LinkedListNode(0);
		LinkedListNode node1 = new LinkedListNode(1);
		LinkedListNode node2 = new LinkedListNode(2);
		LinkedListNode node3 = new LinkedListNode(3);
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		
		deleteNode(node2);
        LinkedListNode.printList(node0);
	};
}
