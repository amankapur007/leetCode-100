package com.coder007.linkedlist;

public class ListNode {
    int data;
    ListNode next;

    public ListNode(int data){
        this.data = data;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(null!=temp){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
