package LinkedList;

public class MergeTwoSortedLists_21 {
	/*
	 * You are given the heads of two sorted linked lists list1 and list2.
	 * 
	 * Merge the two lists in a one sorted list. The list should be made by splicing
	 * together the nodes of the first two lists.
	 * 
	 * Return the head of the merged linked list.
	 */
	static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		else if (list2 == null)
			return list1;
		if (list1.val <= list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}

	}

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
		node5 = reverseList(node5);
		ListNode ode1 = new ListNode(11);
		ListNode ode2 = new ListNode(21, ode1);
		ListNode ode3 = new ListNode(29, ode2);
		ListNode ode4 = new ListNode(41, ode3);
		ListNode ode5 = new ListNode(51, ode4);
		ode5 = reverseList(ode5);
		System.out.println(print(node5));

		System.out.println(print(ode5));

		System.out.println(print(mergeTwoLists(node5, ode5)));
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