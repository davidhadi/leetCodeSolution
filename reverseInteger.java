/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode curr = temp;
        int carry = 0;
        
        while(list1 != null || list2 != null){
            int num1 = (list1 != null) ? list1.val : 0;
            int num2 = (list2 != null) ? list2.val : 0;
            
            int sum = carry + num1 + num2;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (list1 != null)
                list1 = list1.next;
            if (list2 != null)
                list2 = list2.next;
        }
        if (carry > 0)
            curr.next = new ListNode(carry);
    return temp.next;
  }
}