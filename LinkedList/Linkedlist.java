/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author irfan
 */
public class Linkedlist {

    Node head = null;

    void ekle(int x) {
        Node newNode = new Node();
        newNode.data = x;
        if (head == null) {
            head = newNode;
            System.out.println("Liste olusturuuldu eleman eklendi");
        } else {
            Node temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;
            System.out.println("Listenin sonuna eleman eklendi");
        }
    }

    void print() {
        if (head == null) {
            System.out.println("Empty List!!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.nextNode;

            }
            System.out.println("Null");
        }

    }

    void basaEkle(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            newNode.nextNode = null;
            head = newNode;
        } else {
            newNode.nextNode = head;
            head = newNode;

        }

    }

    void sonaEkle(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            newNode.nextNode = null;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = newNode;

        }

    }

    void arayaEkle(int indis, int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null && indis == 0) {  // basa ekleme
            newNode.nextNode = null;
            head = newNode;
        } else if (head != null && indis == 0) {
            newNode.nextNode = head;
            head = newNode;
        } else {  // sona ekleme
            int n = 0;
            Node temp = head;
            Node prev = head;
            while (temp != null) {
                n++;
                prev = temp;
                temp = temp.nextNode;
            }
            if (n == indis) {
                prev.nextNode = newNode;
                newNode.nextNode = temp;
                System.out.println("eleman eklendi");

            } else {
                temp = head;
                prev = head;
                int i = 0;
                while (i != indis) {
                    prev = temp;
                    temp = temp.nextNode;
                    i++;
                }
                prev.nextNode = newNode;
                newNode.nextNode = temp;
            }

        }

    }

    void bastaSil() {
        if (head == null) {
            System.out.println("liste boş silinecek bişey yok");
        } else if (head.nextNode == null) {
            head = null;
            System.out.println("listede kalan son eleman silindi");
        } else {
            head = head.nextNode;
            System.out.println("Bastaki eleman silindi");
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("liste boş silinecek bişey yok");
        } else if (head.nextNode == null) {
            head = null;
            System.out.println("listede kalan son eleman silindi");
        } else {
            Node temp = head;
            Node prev = head;
            while (temp.nextNode != null) {
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = null;
            System.out.println("en son eleman silindi");

        }
    }

    void aradanSil(int indis) {

        if (head == null) {
            System.out.println("liste bos");
        } else if (head.nextNode == null && indis == 0) {
            head = null;
            System.out.println("son eleman da silindi");
        } else if (head.nextNode != null && indis == 0) {
            head = head.nextNode;
            System.out.println("bastaki eleman silindi");
        } else {
            int i = 0;
            Node temp = head;
            Node prev = head;
            while (temp != null) {
                prev = temp;
                i++;
                temp = temp.nextNode;
            }
            if (i == indis) {
                prev.nextNode = null;
                System.out.println("son sıradaki eleman silindi");
            } else {
                temp = head;
                prev = head;
                int j = 0;
                while (j != indis) {
                    prev = temp;
                    temp = temp.nextNode;
                    j++;
                }
                prev.nextNode = temp.nextNode;
                System.out.println("aradaki nesne silindi");
            }
        }

    }
}
