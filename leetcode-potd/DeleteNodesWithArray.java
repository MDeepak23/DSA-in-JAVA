//3217
/*
  3217. Delete Nodes From Linked List Present in Array
You are given an array of integers nums and the head of a linked list.
Return the head of the modified linked list,
after removing all nodes from the linked list that have a value that exists in nums.
Example 1:
Input: nums = [1,2,3], head = [1,2,3,4,5]

Output: [4,5]

Explanation:



Remove the nodes with values 1, 2, and 3.
*/
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
class DeleteNodesWithArray {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        while(head!=null &&  s.contains(head.val)){
            head = head.next;
        }
        if(head==null){
            return null;
        }
        ListNode temp = head;
        while(temp.next!=null){
            if(s.contains(temp.
                         next.val)){
                temp.next = temp.next.next;
                         }
            else{
                temp = temp.next;
            }
              
        }
        return head;
    }
}

 
