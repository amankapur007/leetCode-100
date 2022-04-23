package com.coder007.linkedlist;

import java.util.Scanner;

/**
 * 1->2-3->4->5 -I/P
 * 1->5->2->4->3 -O/P
 * Mid
 * reverse
 * connect
 */
public class FoldLL {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            while (n != 0) {
                int data = sc.nextInt();
                temp.next = new ListNode(data);
                temp = temp.next;
                n--;
            }
            ListNode.display(dummy.next);
            ListNode fold = fold(dummy.next);
            ListNode.display(fold);
        }
    }

    private static ListNode fold(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode midNode = middle(head);
        System.out.println(midNode.data);
        ListNode reverse =  reverse(midNode.next);
        midNode.next = null;
        ListNode.display(head);
        ListNode.display(reverse);

        ListNode c1 = head;
        ListNode c2 = reverse;
        ListNode f1 = null;
        ListNode f2 = null;

        while(c1!=null && c2!=null){
            f1=c1.next;
            f2=c2.next;
            c1.next=c2;
            c2.next=f1;
            c1=f1;
            c2=f2;

        }
        return head;
    }

    private static ListNode reverse(ListNode newHead) {
        if(newHead == null || newHead.next == null){
            return newHead;
        }

        ListNode backup = null;
        ListNode prev = null;
        ListNode curr = newHead;
        while(curr!=null){
            backup = curr.next;
            curr.next = prev;
            prev = curr;
            curr= backup;
        }
        return prev;
    }

    private static ListNode middle(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
