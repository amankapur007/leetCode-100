package com.coder007.linkedlist;

import java.util.Scanner;

public class ReverseLinkedList {
    
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
            ListNode rev = reverse(dummy.next);
            ListNode.display(rev);
        }
    }

    public static ListNode reverse(ListNode head){
        if(null == head || null == head.next){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(null!=current){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
