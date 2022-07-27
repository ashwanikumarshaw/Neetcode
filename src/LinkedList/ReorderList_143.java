package LinkedList;

public class ReorderList_143 {
	/*
	 * You are given the head of a singly linked-list. The list can be represented
	 * as:
	 * 
	 * L0 → L1 → … → Ln - 1 → Ln
	 * 
	 * Reorder the list to be on the following form:
	 * 
	 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → … You may not modify the values in the
	 * list's nodes. Only nodes themselves may be changed.
	 */
	static public void reorderList(ListNode head) {
		  ListNode slow = head;
	        ListNode fast = head.next;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        ListNode second = slow.next;
	        ListNode prev = slow.next = null;
	        while (second != null) {
	            ListNode tmp = second.next;
	            second.next = prev;
	            prev = second;
	            second = tmp;
	        }

	        ListNode first = head;
	        second = prev;
	        while (second != null) {
	            ListNode tmp1 = first.next;
	            ListNode tmp2 = second.next;
	            first.next = second;
	            second.next = tmp1;
	            first = tmp1;
	            second = tmp2;
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

		System.out.println(print(node5));
		node5 = reverseList(node5);
		System.out.println(print(node5));
		reorderList(node5);
		System.out.println(print(node5));

		ListNode ode1 = new ListNode(11);
		ListNode ode2 = new ListNode(21, ode1);
		ListNode ode3 = new ListNode(29, ode2);
		ListNode ode4 = new ListNode(41, ode3);
		ode4 = reverseList(ode4);
		System.out.println(print(ode4));
		reorderList(ode4);
		System.out.println(print(ode4));
		
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
