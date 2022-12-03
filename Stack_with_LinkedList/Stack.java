/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_with_LinkedList;

/**
 *
 * @author irfan
 */
public class Stack {
    int size;
    int cnt;
    Node head;
    
    public Stack(int size) {
        this.size = size;
        cnt = 0;
        head = null;
        
    }
    
     void push(int data){
        Node newNode = new Node(data);
         if (isFull()) {
             System.out.println("Stack Dolu");
         }else{
             if(isEmpty()){
                 head = newNode;
                 System.out.println(head.data + " ilk eleman eklendi");
             }else{
                 newNode.nextNode = head;
                 head = newNode;
                 System.out.println(head.data + " eklendi");
             }
             cnt++;
         }
    }
      void pop(){
          if(isEmpty()){
              System.out.println("stack bos ");
          }else{
              System.out.println(head.data +  " silindi");
              head = head.nextNode;
              cnt--;
          }
        
    }
      
      
      
     boolean isFull(){
         return cnt ==size;
     }
     boolean isEmpty(){
         return cnt == 0;
     }
    
     void print(){
         if (isEmpty()) {
             System.out.println("stack bos");
         }else{
             Node temp = head;
             while(temp!=null){
                 
                 System.out.print(temp.data + "-> ");
                 temp = temp.nextNode;
                 
             }
             System.out.println("");
         }
     }
    
    
    void topGoster(){
        if (isEmpty()) {
            System.out.println("liste bos");
        }else{
            System.out.println("en ustteki data" + head.data);
        }
    }
}
