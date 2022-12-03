/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hash_Table;

/**
 *
 * @author irfan
 */
public class main {

    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        ht.ekle(0, "ahmet");
        ht.ekle(10, "mehmet");
        ht.ekle(3, "kenan");
        ht.ekle(4, "selami");
        ht.ekle(6, "elif");
        ht.ekle(2, "omer");
        ht.ekle(22, "melisa");
        ht.ekle(15, "aysegul");
        ht.ekle(9, "yasemin");

//        System.out.println(ht.dizi[0].next.isim);
//        System.out.println(ht.dizi[0].next.next.isim);
//        System.out.println(ht.dizi[0].next.next.next.isim);
        ht.sil(9);
        ht.yazdir();
    }

}
