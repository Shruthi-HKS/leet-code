package google.interview;



public class AddTwoNumbersInLinkedList {
	public static void main(String[] args) {
		AddTwoNumbersInLinkedList result = new AddTwoNumbersInLinkedList();
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode l3 = result.addTwoNumbers(l1, l2);
		System.out.println(l3.toString());
	}


public ListNode helper(ListNode l1, ListNode l2, int carry) {
	if(l1 == null && l2 == null && carry ==0) {
		if(carry ==0) return null;
		 return new ListNode(1); 
	}
	
	int sum = ((l1 == null ? 0 : l1.val) + (l2 == null ?0 : l2.val))+ carry;
	
	ListNode newListNode = new ListNode(sum%10);
	newListNode.next = helper((l1 == null ? null : l1.next),(l2 == null ? null : l2.next),sum/10);
	
	return newListNode;
}

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	return helper(l1, l2, 0);
}
}
