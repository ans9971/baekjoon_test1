package com.example.codingstudy_230424;

import java.util.NoSuchElementException;

public class QueueTest {
    public static class Queue<T> {
        private Node<T> front; // 큐의 맨 앞
        private Node<T> rear; // 큐의 맨 뒤
        //rear 하나만으로 구현해보면 조금 더 효율적으로 할수있다


        // 연결 리스트에서 사용할 노드 클래스
        private static class Node<T> {
            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
            }
        }

        // 큐가 비어있는지 확인하는 메서드
        public boolean isEmpty() {
            return front == null;
        }

        // 큐에 데이터를 추가하는 메서드
        public void enqueue(T data) {
            Node<T> newNode = new Node<>(data);

            // 큐가 비어있을 경우, 새로운 노드를 front와 rear로 지정
            if (isEmpty()) {
                front = rear = newNode;
            }
            // 큐가 비어있지 않을 경우, rear를 새로운 노드로 변경
            else {
                rear.next = newNode;
                rear = newNode;

            }
        }

        // 큐에서 데이터를 제거하고 반환하는 메서드
        public T dequeue() {
            // 큐가 비어있는 경우
            if (isEmpty()) {
                throw new NoSuchElementException();
            }

            T data = front.data;
            front = front.next;

            // front가 null이면 큐가 비어있다는 의미이므로 rear도 null로 변경
            if (front == null) {
                rear = null;
            }

            return data;
        }
        //rear 알려면 어짜피 탐색 해야된다.
        //어짜피 enqueu하는작업은 빅오 n
        //rear 하나만 있으면됨 프론트는 rear가 가리키고있는곳이 front

        // 큐의 맨 앞 데이터를 반환하는 메서드
        public T peek() {
            // 큐가 비어있는 경우
            if (isEmpty()) {
                throw new NoSuchElementException();
            }

            return front.data;
        }

        // 큐의 내용을 문자열로 반환하는 메서드
        @Override
        public String toString() {
            if (isEmpty()) {
                return "[]";
            }

            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Node<T> current = front;
            while (current != null) {
                sb.append(current.data).append(", ");
                current = current.next;
            }
            sb.setLength(sb.length() - 2); // 마지막 ", " 제거
            sb.append("]");

            return sb.toString();
        }
    }
//    public static void main(String[] args) {
//        Queue<Integer> queue = new Queue<>();
//
//        // 큐에 데이터 추가
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        // 큐의 내용 출력
//        System.out.println(queue.toString()); // [1, 2, 3]
//
//        // 큐에서 데이터 제거
//        int data1 = queue.dequeue();
//        int data2 = queue.dequeue();
//
//        // 큐의 내용 출력
//        System.out.println(queue.toString()); // [3]
//
//        // 큐의 맨 앞 데이터 확인
//        System.out.println(queue.peek()); // 3
//
//        // 큐에 데이터 추가
//        queue.enqueue(4);
//
//        // 큐의 내용 출력
//        System.out.println(queue.toString()); // [3, 4]
//
//        // 큐에서 모든 데이터 제거
//        int data3 = queue.dequeue();
//        int data4 = queue.dequeue();
//
//        // 큐의 내용 출력
//        System.out.println(queue.toString()); // []
//
//        // NoSuchElementException 예외 발생
//        try {
//            int data5 = queue.dequeue();
//        } catch (NoSuchElementException e) {
//            System.out.println("큐가 비어있습니다.");
//        }
//    }
}
