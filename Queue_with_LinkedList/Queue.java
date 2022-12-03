/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_with_LinkedList;

/**
 *
 * @author irfan
 */
public class Queue {

    Node front;  // head
    Node rear; // tail

    int counter;
    int size;

    public Queue(int size) {
        this.size = size;
        counter = 0;
        front = null;
        rear = null;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("kuyruk doluu");
        } else {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                System.out.println(data + " kuyruga ilk eklendi");
            } else {
                rear.nextNode = newNode;
                rear = rear.nextNode;
                System.out.println(data + " kuyruya eklendi");
            }
            counter++;
        }

    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("liste bosss");
        } else {
            System.out.println(front.data + "silindi");
            front = front.nextNode;
            counter--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("liste bosss");
        }else{
            Node temp = front;
            System.out.print("bas <- ");
            while(temp != null){
                System.out.print(temp.data+ "<- ");
                temp = temp.nextNode;
            }
            System.out.println("son");
        }
    }
    boolean isEmpty() {
        return counter == 0;
    }

    boolean isFull() {

        return counter == size;
    }

}
