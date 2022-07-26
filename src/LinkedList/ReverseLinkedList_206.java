package LinkedList;

public class ReverseLinkedList_206 {
	/*
	 * Given the head of a singly linked list, reverse the list, and return the
	 * reversed list.
	 * 
	 */
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */

	static public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode prev = null;
		ListNode next = null;
		while (head != null) {
			next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(20, node1);
		ListNode node3 = new ListNode(30, node2);
		ListNode node4 = new ListNode(40, node3);
		ListNode node5 = new ListNode(50, node4);

		System.out.println(print(node5));
		System.out.println(print(reverseList(node5)));
	}

	private static String print(ListNode node) {
		String s = "head";
		while (node != null) {
			s = s + "->" + node.val;
			node = node.next;
		}
		return s;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
