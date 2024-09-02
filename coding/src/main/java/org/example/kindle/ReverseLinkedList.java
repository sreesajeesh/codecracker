package org.example.kindle;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.StringJoiner;

public class ReverseLinkedList {

    Node head;
    @Data
    @AllArgsConstructor
    private class Node{
        final int data;
        Node next;
    }

    public void add(int data){
        Node node = new Node(data, null);
        if(head == null){
            head = node;
        } else {
            Node last = head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
    }

    public void reverse(){
        if(head == null)
            return;
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    @Override
    public String toString(){
        StringJoiner stringJoiner = new StringJoiner("->" , "[","]");
        Node last = head;
        while (last != null){
            stringJoiner.add(String.valueOf(last.data));
            last = last.next;
        }
        return stringJoiner.toString();
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.add(1);
        reverseLinkedList.add(2);
        reverseLinkedList.add(3);
        reverseLinkedList.add(4);
        System.out.println(reverseLinkedList);
        reverseLinkedList.reverse();
        System.out.println(reverseLinkedList);
    }

}
