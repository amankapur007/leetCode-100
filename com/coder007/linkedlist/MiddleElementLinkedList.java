package com.coder007.linkedlist;

import java.util.Scanner;

public class MiddleElementLinkedList {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n =  sc.nextInt();
            ListNode dummy =  new ListNode(-1);
            ListNode temp = dummy;
            while(n!=0){
                int data = sc.nextInt();
                temp.next = new ListNode(data);
                temp = temp.next;
                n--;
            }
            ListNode.display(dummy.next);
            int data = middle(dummy.next);
            System.out.println(data);
        }
    }

    public static int middle(ListNode head){
        if(null == head){
            return -1;
        }
        if(head.next == null){
            return head.data;
        }

        ListNode fast = head;
        ListNode slow = head;
        while(null!=fast && null!=fast.next){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
