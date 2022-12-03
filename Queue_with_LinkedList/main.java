/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_with_LinkedList;

/**
 *
 * @author irfan
 */
public class main {
    public static void main(String[] args) {
        Queue que = new Queue(5);
        
        que.enqueue(31);
        que.enqueue(66);
        que.enqueue(95);
        que.print();
        System.out.println("/////////////////////////");
        que.enqueue(77);
        que.dequeue();
        que.print();
    }
}
