/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleLinkedList;

/**
 *
 * @author irfan
 */
public class DoubleLinkedList {

    Node tail = null;
    Node head = null;

    void basaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.nextNode = head;
            head.prevNode = newNode;
            head = newNode;
        }
    }

    void arayaEkle(int data, int indis) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

        } else if (head != null && indis == 0) {
            newNode.nextNode = head;
            head.prevNode = newNode;
            head = newNode;

        } else {

            int size = 0;
            Node temp = head;

            while (temp != null) {
                temp = temp.nextNode;
                size++;
            }
            temp = head;
            if (size < indis) {
                tail.nextNode = newNode;
                newNode.prevNode = tail;
                tail = newNode;

            } else {
                int i = 0;
                while (i != indis) {
                    temp = temp.nextNode;
                    i++;
                }
                newNode.prevNode = temp.prevNode;
                temp.prevNode.nextNode = newNode;

                newNode.nextNode = temp;
                temp.prevNode = newNode;

            }
        }
    }

    void sonaEkle(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = newNode;
        }
    }

    void bastanSil() {
        if (head != null) {
            if (head.nextNode == null) {
                head = null;
                tail = null;
            } else {
                head = head.nextNode;
                head.prevNode = null;
            }
        }
    }

    void sondanSil() {
        if (head != null) {
            if (head.nextNode == null) {
                head = null;
                tail = null;
            } else {
                tail = tail.prevNode;
                tail.nextNode = null;

            }
        }
    }

    void aradanSil(int indis) {
        if (head != null) {
            if (head.nextNode == null && indis <= 0) {
                head = null;
                tail = null;
            } else if (head.nextNode != null && indis <= 0) {
                head = head.nextNode;
                head.prevNode = null;

            } else {
                int size = 0;
                Node temp = head;
                while (temp != null) {
                    size++;
                    temp = temp.nextNode;
                }
                if (indis >= size - 1) {
                    tail = tail.prevNode;
                    tail.nextNode = null;
                }else{
                    temp = head;
                    int i =0;
                    while(i<indis){
                        i++;
                        temp = temp.nextNode;
                    }
                    temp.nextNode.prevNode = temp.prevNode;
                    temp.prevNode.nextNode = temp.nextNode;
                    
                }

            }
        }
    }

    void yazdir() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.nextNode;
        }
        System.out.println("Null");
    }

    void sondanYazdir() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.prevNode;
        }
        System.out.println("Null");
    }

}
