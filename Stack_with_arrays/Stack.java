/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack_with_arrays;

/**
 *
 * @author irfan
 */
public class Stack {

    int dizi[];
    int size;
    int indis;

    public Stack(int size) {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }

    void push(int data) { // ekle
        if(isFull()){
            System.out.println("Stack dolu");
        }else{
        indis++;
        dizi[indis] = data;
       
        
        }
        }
    
    int pop(){
       if(  !isEmpty()){
           return dizi[--indis];
       }else{
           System.out.println("dizi bos");
           return -1;
       }
    }
    
    boolean isFull(){
        return (indis == size-1);
    }
    boolean isEmpty(){
        return (indis == -1);
    }

    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(dizi[i] + "-> ");
        }
        System.out.println("");
    }
}
