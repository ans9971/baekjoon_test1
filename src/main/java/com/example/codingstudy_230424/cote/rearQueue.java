package com.example.codingstudy_230424.cote;

import java.util.NoSuchElementException;
//간단하게 보기좋게 주석 달기
public class rearQueue {

    private Node rear;
    private int size;

    private static class Node {
        private final int data;
        private Node next;

        private Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public rearQueue() {
        this.rear = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            newNode.next = newNode;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node head = rear.next;
        if (head == rear) {
            rear = null;
        } else {
            rear.next = head.next;
        }
        size--;
        return head.data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return rear.next.data;
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = rear.next;
        while (current != rear) {
            sb.append(current.data).append(", ");
            current = current.next;
        }
        sb.append(rear.data).append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        rearQueue queue = new rearQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Queue: " + queue);

        int dequeuedElement = queue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue: " + queue);

        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        int queueSize = queue.size();
        System.out.println("Size of queue: " + queueSize);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}