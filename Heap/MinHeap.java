/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

/**
 *
 * @author fsmblm0
 */
public class MinHeap <T  extends Comparable<T>>{
    T heap [];
    private int size;

    public MinHeap(int N) {
        heap=(T[]) new Comparable[N];
        size=0;
    }
    int parent(int index){
        return (index-1)/2;
    }
    void swap(int i, int j){
        T temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    void insert(T data){
        if(size<heap.length){
            heap[size]=data;
            int current=size;
            int parent=parent(current);
            
            while(heap[current].compareTo(heap[parent])<0){
                swap(current,parent);
                current=parent;
                parent=parent(current);
            }
            size++;
        }else{
            System.out.println("Heap is full!");
        }
    }
    void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    void heapify(){
        int lastindex=size-1;
        int parent=parent(lastindex);
        
        for (int i = parent; i >=0; i--) {
            minHeap(i);
        }
    }
    void minHeap(int i){
        int left=2*i+1;
        int right=2*i+2;
        
        int min=i;
        if(left<size && heap[left].compareTo(heap[min])<0){
            min=left;
        }
        if(right<size && heap[right].compareTo(heap[min])<0){
            min=right;
        }
        if(min!=i){
            swap(min, i);
            minHeap(min);
        }
            
    }
    T deleteMin(){
        T deleted=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify();
        return deleted;
    }
    
}
