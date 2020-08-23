/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        int len = getListLen(head);
        int[] res = new int[len];
        ListNode cur = head;
        while (cur != null) {
            res[--len] = cur.val;
            cur = cur.next;
        }
        return res;
    }

    public int getListLen(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len += 1;
        }
        return len;
    }
}
