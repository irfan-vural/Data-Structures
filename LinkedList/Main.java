/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Main {

    public static void main(String[] args) {
        Linkedlist liste = new Linkedlist();
        Scanner sc = new Scanner(System.in);
        int secim = -1;
        int sayi, indis;
        while (secim != 0) {
            System.out.println("1 basa ekle");
            System.out.println("2 basa sona");
            System.out.println("3 araya ekle");
            System.out.println("4 bastan sil");
            System.out.println("5 sondan sil");
            System.out.println("6 aradan sil");
            System.out.println("0 cikis");
            System.out.println("Seciniz");
            secim = sc.nextInt();

            if (secim == 1) {
                System.out.println("sayi : ");
                sayi = sc.nextInt();
                liste.basaEkle(sayi);

            } else if (secim == 2) {
                System.out.println("sayi : ");
                sayi = sc.nextInt();
                liste.sonaEkle(sayi);

            } else if (secim == 3) {
                System.out.println("sayi  : ");
                sayi = sc.nextInt();

                System.out.println("indis  : ");
                indis = sc.nextInt();
                liste.arayaEkle(indis, sayi);

            } else if (secim == 4) {

                liste.bastaSil();

            } else if (secim == 5) {

                liste.sondanSil();

            } else if (secim == 6) {
                System.out.println("indis : ");
                indis = sc.nextInt();
                liste.aradanSil(indis);

            }else{
                System.out.println("hatali giris yaptiniz tekrar deneyiniz");
            }
            liste.print();
        }

    }

}
