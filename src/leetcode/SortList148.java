package leetcode;

public class SortList148 {
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = getMiddleNode(head);
        ListNode middleNext = middle.next;
        middle.next = null;


        ListNode left = sortList(head);
        ListNode right = sortList(middleNext);

        return mergeSortedNodes(left, right);
    }

    private static ListNode getMiddleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private static ListNode mergeSortedNodes(ListNode a, ListNode b) {
        ListNode result = null;

        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }

        if (a.val <= b.val) {
            result = a;
            result.next = mergeSortedNodes(a.next, b);
        } else {
            result = b;
            result.next = mergeSortedNodes(a, b.next);
        }

        return result;
    }

    public static void test() {
        ListNode head = new ListNode(50,
                new ListNode(10,
                        new ListNode(40,
                                new ListNode(20,
                                        new ListNode(5)))));
        head = sortList(head);
        while (head != null){
            System.out.print(head.val);
            System.out.print(", ");
            head = head.next;
        }
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


