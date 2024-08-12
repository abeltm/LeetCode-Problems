package com.teamsix.leetcode;

//created a class to represent a node in the list
class ListNode1 {

//			initialize a value which is stored in the node
	int x;

//			retrieve the next node in the list
	ListNode next;

//			create a default constructor to initialize an empty node
	ListNode1() {
	}

//			use a constructor and initialize the node with a value of x
	ListNode1(int x) {
		this.x = x;
	}

//			use a constructor to initialize the node with a value of x and the next node
	ListNode1(int x, ListNode next) {
		this.x = x;
		this.next = next;
	}
}

class MergeList {

//			Method to merge two sorted linked lists
	public ListNode mergeLists(ListNode list1, ListNode list2) {

//				use If condition to check if both lists are not null
		if (list1 != null && list2 != null) {

//					use another if condition to Compare the values of the l1 and l2 nodes
			if (list1.x < list2.x) {

//						merge the next node of list1 with list2
				list1.next = mergeLists(list1.next, list2);

//						return the current node of list1
				return list1;

			}

//					else merge list1 with the next node of list2
			else {
				list2.next = mergeLists(list1, list2.next);

//						then return the current node of list2
				return list2;
			}
		}

//				If list1 is null, return list2
		if (list1 == null) {
			return list2;
		}

//				If list2 is null, return list1
		return list1;
	}

	public static void main(String[] args) {

//				create the first linked list: list1 = [1, 2, 4]
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

//				create the second linked list: list2 = [1, 3, 4]
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

//				instantiate the mergeList class from above
		MergeList merge = new MergeList();

//				call the mergeTwoLists method
		ListNode mergedList = merge.mergeLists(list1, list2);

//				print out the result of the linked list
		System.out.print("The merged List is: ");

//				initialize the start of the node to result
		ListNode node = mergedList;

//				use while loop to iterate through while node is not null, and print the values		
		while (node != null) {
			System.out.print(node.x);

//					use if condition to check the next node and use symbol for separation
			if (node.next != null) {
				System.out.print(" -> ");
			}

//					assign the pointer of the node to the next node in the list 			
			node = node.next;
		}

	}

}
