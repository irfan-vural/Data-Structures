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
public class Test {

    public static void main(String[] args) {
        MinHeap<Integer> heap = new MinHeap(10);
        heap.insert(8);
        heap.insert(15);
        heap.insert(5);
        heap.insert(12);
        heap.insert(30);
        heap.insert(10);
        heap.insert(18);
        heap.print();

        System.out.println("Deleted element:" + heap.deleteMin());
        heap.print();
    }
}
