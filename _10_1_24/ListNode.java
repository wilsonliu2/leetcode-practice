package _10_1_24;

public class ListNode {
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

// turtle and hare tech, then reverse and compare. time O(n) space O(1)
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode end = head;
        ListNode mid = head;

        while (end != null && end.next != null) {
            end = end.next.next;
            mid = mid.next;
        }
        ListNode second = reverse(mid);
        ListNode start = head;
        while (second != null) {
            if (second.val != start.val) {
                return false;
            }
            second = second.next;
            start = start.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}