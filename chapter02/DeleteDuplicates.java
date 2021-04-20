/*
 * Question 2.1
 */
package chapter02;

import utils.LinkedListNode;

public class DeleteDuplicates {
	public static void deleteDuplicates(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListNode first = new LinkedListNode(1);
		LinkedListNode second = new LinkedListNode(3);
		LinkedListNode third = new LinkedListNode(2);
		LinkedListNode fourth = new LinkedListNode(3);
		LinkedListNode fifth = new LinkedListNode(2);
		LinkedListNode sixth = new LinkedListNode(5);
		first.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(sixth);
		
		LinkedListNode head = first;
		deleteDuplicates(head);
		LinkedListNode.printList(first);
	}
}
