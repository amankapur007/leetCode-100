package com.coder007.linkedlist;

import java.util.Scanner;

/**
 * Get the mid
 * Make mid.next = null
 * Reverse the list after mid
 * Compare both
 */
public class PalindromeLL {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);5
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
        if(palindrome(dummy.next)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    private static boolean palindrome(ListNode node) {
        //1. Get the mid node
        ListNode  midNode =  middle(node);
        ListNode.display(midNode);
        //2. Reverse the list
        ListNode reverse =  reverse(midNode.next);
        midNode.next = null;

        ListNode c1 = node;
        ListNode c2 = reverse;

        while(c1!=null && c2!=null){
            if(c1.data !=c2.data) return false;
            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode midNode) {
        return null;
    }

    private static ListNode middle(ListNode node) {
        ListNode fast =  node;
        ListNode slow = node;
        while(null!=fast && null!=fast.next){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
}
