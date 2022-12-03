/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue_with_arrays;

/**
 *
 * @author irfan
 */
public class main {
    public static void main(String[] args) {
        Queue que = new Queue(5);
        
        que.enqueue(41);
                que.enqueue(51);
        que.enqueue(61);
        que.enqueue(71);
        que.yazdir();

        que.enqueue(81);
       
        que.dequeue();
               que.yazdir();
               
            
    }
}
