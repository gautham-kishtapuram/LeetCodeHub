package org.implementations;
// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class Leetcode21 {
	public static void main(String[] args) {
		Leetcode21 leetcode21 = new Leetcode21();

		ListNode node1 = leetcode21.new ListNode(1);
		ListNode node2 = leetcode21.new ListNode(2);
		ListNode node3 = leetcode21.new ListNode(4);
		ListNode node4 = leetcode21.new ListNode(7);
		ListNode node5 = leetcode21.new ListNode(10);
		ListNode node6 = leetcode21.new ListNode(11);
		ListNode node7 = leetcode21.new ListNode(12);
		ListNode node8 = leetcode21.new ListNode(13);
		ListNode node9 = leetcode21.new ListNode(15);
		ListNode node10 = leetcode21.new ListNode(16);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;

		ListNode nnode1 = leetcode21.new ListNode(1);
		ListNode nnode2 = leetcode21.new ListNode(3);
		ListNode nnode3 = leetcode21.new ListNode(4);
		ListNode nnode4 = leetcode21.new ListNode(8);
		ListNode nnode5 = leetcode21.new ListNode(14);

		nnode1.next = nnode2;
		nnode2.next = nnode3;
		nnode3.next = nnode4;
		nnode4.next = nnode5;

		System.out.println(node1);
		System.out.println(nnode1);

		System.out.println(leetcode21.mergeTwoLists(node1, nnode1));
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode listNodeToReturn = new ListNode(0);
		ListNode pointerNode = listNodeToReturn;
		var firstListNode = list1;
		var secondListNode = list2;
		while (firstListNode != null && secondListNode != null) {
			if (firstListNode.val < secondListNode.val) {
				pointerNode.next = firstListNode;
				firstListNode = firstListNode.next;
			} else {
				pointerNode.next = secondListNode;
				secondListNode = secondListNode.next;
			}
			pointerNode = pointerNode.next;

		}
		if (firstListNode != null) {
			pointerNode.next = firstListNode;
		}
		if (secondListNode != null) {
			pointerNode.next = secondListNode;
		}
		return listNodeToReturn.next;
	}

	public class ListNode implements Cloneable {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder("{");
			ListNode node = this;
			while (node != null) {
				stringBuilder.append(node.val);
				node = node.next;
				if (node != null) {
					stringBuilder.append(", ");
				}
			}
			stringBuilder.append("}");
			return stringBuilder.toString();
		}
	}

}
