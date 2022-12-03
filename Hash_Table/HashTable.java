/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_Table;

/**
 *
 * @author irfan
 */
public class HashTable {

    Node dizi[];
    int size;

    public HashTable(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i++) {
            dizi[i] = new Node();
        }
    }

    int indexUret(int key) {

        return key % size;
    }

    void ekle(int key, String isim) {
        int index = indexUret(key);
        Node eleman = new Node(key, isim);

        Node temp = dizi[index];

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = eleman;
        System.out.println(eleman.isim + " eklendi ");

    }

    void sil(int key) {
        int indis = indexUret(key);
        Node temp = dizi[indis];
        Node temp2 = dizi[indis];

        if (temp.next == null) {
            System.out.println(key + " numarali kayit yok");

        } else if (temp.next.next == null && temp.next.key == key) {
            System.out.println(temp.next.isim + " silindi (son ksisiydi)");
            temp.next = null;
            
        } else {
            
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
                if (temp.key == key) {
                    System.out.println(temp.isim + " silindi");
                    temp2.next = temp.next;
                }
               
            }

        }
    }

    void yazdir() {
        for (int i = 0; i < size; i++) {
            Node temp = dizi[i];
            System.out.print("dizinin[" + i + "] -> ");
            if (temp.next != null) {
                while (temp.next != null) {
                    System.out.print(temp.next.key + " - " + temp.next.isim + " -> ");
                    temp = temp.next;
                }

                System.out.println("null");
            }
        }

    }

}
