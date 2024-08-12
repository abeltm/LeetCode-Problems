package com.teamsix.leetcode;

//created a class to represent a node in the list
class ListNode {

//	initialize a value which is stored in the node
	int x;

//	retrieve the next node in the list
	ListNode next;

//	create a default constructor to initialize an empty node
	ListNode() {
	}

//	use a constructor and initialize the node with a value of x
	ListNode(int x) {
		this.x = x;
	}
}

class SumOfLinkedList {

//created method to add the two numbers in the list
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//		initialize sum to store the sum of nodes and calculate the first two nodes of l1 and l2
		int sum = l1.x + l2.x;
		;

//		initialize a carry that stores the carry over values and assign it to 0
		int carry = 0;

//		check if sum is greater than 10 to see if it has a carry
//		if it has a carry, set the value of carry to one and adjust the sum by deducting 10
		if (sum >= 10) {
			sum = sum - 10;
			carry = 1;
		}

//		set the value of l1 node to the summation value
		l1.x = sum;

//		used if condition to check for carry
		if (carry == 1) {

//			used if condition to check the next node is not null and increment the value by the value of the carry
			if (l1.next != null) {
				l1.next.x++;
			}

//			else create a new node with the value of the carry

			else {
				l1.next = new ListNode(carry);
			}
		}

//		use the above methods for the next value of nodes in l1 and l2
//		use if-else-if condition
		if (l1.next != null && l2.next != null)
			addTwoNumbers(l1.next, l2.next);

//		if l1 has next value but l2 is null, assign l2 value with 0
		else if (l1.next != null && l2.next == null)
			addTwoNumbers(l1.next, new ListNode(0));

//		if l2 has next value but l1 is null, assign l1 value with 0		
		else if (l2.next != null && l1.next == null) {
			l1.next = new ListNode(0);
			addTwoNumbers(l1.next, l2.next);
		}

//		return the list with new summation values of l1
		return l1;
	}

	public static void main(String[] args) {

//		 Create first linked list l1 = [2, 4, 3]
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

//		Create second linked list l2 = [5, 6, 4]
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

// 		instantiate the class above (SumOfLinkedList)
		SumOfLinkedList solution = new SumOfLinkedList();

//		call the addTwoNumbers method and store them under result
		ListNode result = solution.addTwoNumbers(l1, l2);

//		print out the result
		System.out.print("The sum of the two numbers is: ");

//		initialize the start of the node to result
		ListNode node = result;

//		use while loop to iterate through while node is not null, and print the values
		while (node != null) {
			System.out.print(node.x);

//			use if condition to check the next node and use symbol for separation
			if (node.next != null) {
				System.out.print(" - ");
			}

//			assign the pointer of the node to the next node in the list 
			node = node.next;
		}

	}

}