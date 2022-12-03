/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_with_arrays;

/**
 *
 * @author irfan
 */
public class Queue {

    int[] dizi;
    int size;
    int front; // ilk eleman
    int rear;  // son eleman

    public Queue(int size) {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("dolu eklemee");
        } else {
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + " kuyruga eklendi");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("kuyuruk boss");
        } else {

            int sayi = dizi[front];
            for (int i = 1; i <= rear; i++) {
                dizi[i - 1] = dizi[i];
            }
            rear--;
            System.out.println(sayi + " kuyruktan cikti");
        }
    }

    boolean isFull() {
        return rear == size - 1;
    }

    boolean isEmpty() {
        return rear == -1;
    }
    
    void elemanSayisi(){
        System.out.println("eleman sayisi : " + rear+1);
    }
    void yazdir(){
        int i =rear;
        System.out.println("son -> ");
         while(i>=0){
             System.out.print(dizi[i] + "-> ");
            i--;
        }
         System.out.println("son");
    }

}
