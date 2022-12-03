/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_Table;

/**
 *
 * @author irfan
 */
public class Node {

    int key;
    String isim;
    Node next;

    public Node() {
        next = null;
    }

    public Node(int key, String isim) {

        this.key = key;
        this.isim = isim;
        next = null;
    }

}
